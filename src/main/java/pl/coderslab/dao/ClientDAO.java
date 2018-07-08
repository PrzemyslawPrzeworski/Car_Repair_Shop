package pl.coderslab.DAO;

import pl.coderslab.model.Client;
import pl.coderslab.services.DBService;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {


        private String databaseName = "Car_Repair_Shop";

        public void save (Client client) {

            if (client.getId() == 0) {
                this.addClient(client);
            }
        }


        private  void addClient(Client client) {
            String query = "INSERT INTO clients VALUES (?, ?, ?)";
            List<String> queryParams = new ArrayList<>();
            queryParams.add(String.valueOf(client.getId()));
            queryParams.add( client.getName());
            queryParams.add(client.getSurname());

            DBService.executeUpdate(this.databaseName, query, queryParams);
        }

        private void updateClient (Client client) {
            String query = "UPDATE clients set firstname = ?, secondname = ?, Where id = ?"; //NAZWA TABELI

            List<String> queryParams = new ArrayList<>();
            queryParams.add( client.getName()) ;
            queryParams.add( client.getSurname() );
            queryParams.add( String.valueOf(client.getId()) );

            DBService.executeUpdate(this.databaseName, query, queryParams);

        }
    }

