package Model;

import SystemEntities.HealthTrackDbManager;
import br.com.fiap.healthtrack.Peso;
//import oracle.jvm.hotspot.jfr.Producer;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class PesoDao implements Dao<Peso> {

    private Connection connection;
    private List<Peso> pesos = new ArrayList<>();
    private PreparedStatement preparedStatement = null;


    public PesoDao() {
    }

    @Override
    public Peso getById(int id) {
        Peso peso = new Peso();
        ResultSet resultSet = null;
        try {
            connection = HealthTrackDbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM T_HT_USER_WEIGHT WHERE cd_weight = ?");
            preparedStatement.setInt(1, id);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                peso.setCodPeso(resultSet.getInt("cd_weight"));
                peso.setCodUsuario(resultSet.getInt("cd_user"));
                peso.setPesoUsuario(resultSet.getDouble("vl_weight"));
                peso.setDataPeso(resultSet.getString("dt_weight"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return peso;

    }

    @Override
    public List<Peso> getAll() {
        try {
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM T_HT_USER_WEIGHT ORDER BY cd_weight");
            while (resultSet.next()) {
                Peso peso = new Peso(resultSet.getInt("cd_weight"), resultSet.getInt("cd_user"), resultSet.getDouble("vl_weight"), resultSet.getString("dt_weight"));
                pesos.add(peso);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return pesos;
    }

    @Override
    public void insert(Peso peso) {
        try {
            connection = HealthTrackDbManager.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO T_HT_USER_WEIGHT (cd_weight, vl_weight, dt_weight, cd_user) values (?,?,?,?)");
            preparedStatement.setInt(1, peso.getCod());
            preparedStatement.setDouble(2, peso.getPesoUsuario());
            java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
            preparedStatement.setDate(3, date);
            preparedStatement.setInt(4, peso.getCodUsuario());
            preparedStatement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try{
                preparedStatement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

    }

    @Override
    public void update(Peso pesoAtualizado) {

        try{
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE T_HT_USER_WEIGHT SET vl_weight =" + pesoAtualizado.getPesoUsuario() + ", dt_weight = TO_DATE('" + pesoAtualizado.getDataPeso() + "','DD/MM/YYYY') WHERE cd_weight ="+pesoAtualizado.getCod());
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            try{
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }


    @Override
    public void delete(int index) {
        try{
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM T_HT_USER_WEIGHT WHERE cd_weight = "+index);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
