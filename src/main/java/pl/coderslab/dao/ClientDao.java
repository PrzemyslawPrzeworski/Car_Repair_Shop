package pl.coderslab.dao;

import pl.coderslab.model.Car;
import pl.coderslab.model.Client;
import pl.coderslab.services.DBService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {


        private String databaseName = "Car_Repair_Shop";

        public void save (Client client) {

            if (client.getId() == 0) {
                this.addClient(client);
            } else {
                this.updateClient(client);
            }
        }


        public  void addClient(Client client) {
            String query = "INSERT INTO clients VALUES (?, ?, ?)";
            List<String> queryParams = new ArrayList<>();
            queryParams.add(String.valueOf(client.getId()));
            queryParams.add( client.getFirst_name());
            queryParams.add(client.getSecond_name());

            DBService.executeUpdate(this.databaseName, query, queryParams);
        }

    public void updateClient (Client client) {
            String query = "UPDATE clients SET first_name = ?, second_name = ? WHERE id = ?"; //NAZWA TABELI

            List<String> queryParams = new ArrayList<>();
            queryParams.add( client.getFirst_name()) ;
            queryParams.add( client.getSecond_name() );
            queryParams.add( String.valueOf(client.getId()) );

            DBService.executeUpdate(this.databaseName, query, queryParams);

        }


    public Client findClienyById(int id) {
        String query = "SELECT * FROM clients WHERE id = " + id;
        Client client = new Client();
        try (ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)) {
            while (rs.next()) {
                client.setId(rs.getInt("id"));
                client.setFirst_name(rs.getString("first_name"));
                client.setSecond_name(rs.getString("second_name"));
            }
            return client;
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return client;
    }


    public List<Client> loadAll(){
        List<Client> allClients = new ArrayList<>();

        String query = "SELECT * FROM clients";

        try(ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)){
            while (rs.next()) {
                Client client = new Client();
                client.setId(rs.getInt("id"));
                client.setFirst_name(rs.getString("first_name"));
                client.setSecond_name(rs.getString("second_name"));
                allClients.add(client);
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return allClients;
    }


    public void delete(int id){
        String query = "DELETE FROM clients WHERE id=" + id;
        try {
            DBService.executeUpdate(this.databaseName, query);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }





}

