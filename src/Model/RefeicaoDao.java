package Model;

import SystemEntities.HealthTrackDbManager;
import br.com.fiap.healthtrack.Peso;
import br.com.fiap.healthtrack.Refeicao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RefeicaoDao implements Dao<Refeicao> {

    private Connection connection;
    private List<Refeicao> refeicoes = new ArrayList<>();
    private PreparedStatement preparedStatement = null;

    public RefeicaoDao() {}

    @Override
    public Refeicao getById(int cod) {
        Refeicao refeicao = new Refeicao();
        ResultSet resultSet = null;
        try {
            connection = HealthTrackDbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM NOME_TABELA WHERE nome_coluna = ?");
            preparedStatement.setInt(1, cod);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                refeicao.setCodRefeicao(resultSet.getInt("cd_weight"));
                refeicao.setCodUsuario(resultSet.getInt("cd_user"));
                refeicao.setCalorias(resultSet.getDouble("vl_weight"));
                refeicao.setDataRefeicao(resultSet.getString("dt_weight"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return refeicao;
    }

    @Override
    public List getAll() {
        try {
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NOME_TABELA ORDER BY codigo");
            while (resultSet.next()) {
                Refeicao refeicao = new Refeicao(resultSet.getInt("xxx"), resultSet.getInt("xxx"), resultSet.getString("xxx"),resultSet.getDouble("xxx"), resultSet.getString("xxx"));
                refeicoes.add(refeicao);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return refeicoes;
    }


   @Override
    public void insert(Refeicao refeicao) {
        try {
            connection = HealthTrackDbManager.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO NOME_TABELA (sequence_xxx, xxx, xxx, xxxx, xxxx) values (?,?,?,?)");
            preparedStatement.setInt(1, refeicao.getCodUsuario());
            preparedStatement.setString(2, refeicao.getTipoRefeicao());
            preparedStatement.setDouble(3, refeicao.getCalorias());
            preparedStatement.setString(4, refeicao.getDataRefeicao());
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
    public void update(Refeicao refeicao) {
        try{
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE T_HT_USER_WEIGHT SET xxxx =" + refeicao.getCalorias()+ ", xxxx = TO_DATE('" + refeicao.getDataRefeicao() + "','DD/MM/YYYY') WHERE xxxx ="+refeicao.getCodRefeicao());
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
    public void delete(int idx) {
        try{
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM NOME_TABELA WHERE nome_coluna = "+idx);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

/*
*/