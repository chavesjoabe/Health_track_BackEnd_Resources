package Model;

import SystemEntities.HealthTrackDbManager;
import br.com.fiap.healthtrack.Atividade;
import br.com.fiap.healthtrack.Refeicao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AtividadeDao implements Dao<Atividade> {

    private Connection connection;
    private List<Atividade> atividades = new ArrayList<>();
    private PreparedStatement preparedStatement = null;

    @Override
    public Atividade getById(int cod) {
        Atividade atividade = new Atividade();
        ResultSet resultSet = null;
        try {
            connection = HealthTrackDbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM NOME_TABELA WHERE nome_coluna = ?");
            preparedStatement.setInt(1, cod);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                atividade.setCodAtividade(resultSet.getInt("cd_weight"));
                atividade.setCodUsuario(resultSet.getInt("cd_user"));
                atividade.setDuracaoAtividade(resultSet.getDouble("vl_weight"));
                atividade.setNomeAtividade(resultSet.getString("dt_weight"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return atividade;
    }

    @Override
    public List<Atividade> getAll() {
        try {
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM NOME_TABELA ORDER BY codigo");
            while (resultSet.next()) {
                Atividade atividade = new Atividade(resultSet.getInt("xxx"), resultSet.getInt("xxx"), resultSet.getString("xxx"),resultSet.getDouble("xxx"));
                atividades.add(atividade);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return atividades;
    }


    @Override
    public void insert(Atividade atividade) {
        try {
            connection = HealthTrackDbManager.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO NOME_TABELA (sequence_xxx, xxx, xxx, xxxx, xxxx) values (?,?,?)");
            preparedStatement.setInt(1, atividade.getCodUsuario());
            preparedStatement.setString(2, atividade.getNomeAtividade());
            preparedStatement.setDouble(3, atividade.getDuracaoAtividade());
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
    public void update(Atividade atividade) {
        try{
            connection = HealthTrackDbManager.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE T_HT_USER_WEIGHT SET xxxx =" + atividade.getNomeAtividade()+ ", xxxx = TO_DATE('" + atividade.getDuracaoAtividade() + "','DD/MM/YYYY') WHERE xxxx ="+atividade.getCodAtividade());
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
