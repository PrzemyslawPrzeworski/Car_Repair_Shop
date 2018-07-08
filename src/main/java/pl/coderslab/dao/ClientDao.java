package pl.coderslab.dao;

import pl.coderslab.model.Client;
import pl.coderslab.services.DBService;

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


        private  void addClient(Client client) {
            String query = "INSERT INTO clients VALUES (?, ?, ?)";
            List<String> queryParams = new ArrayList<>();
            queryParams.add(String.valueOf(client.getId()));
            queryParams.add( client.getFirst_name());
            queryParams.add(client.getSecond_name());

            DBService.executeUpdate(this.databaseName, query, queryParams);
        }

        private void updateClient (Client client) {
            String query = "UPDATE clients SET first_name = ?, second_name = ?, WHERE id = ?"; //NAZWA TABELI

            List<String> queryParams = new ArrayList<>();
            queryParams.add( client.getFirst_name()) ;
            queryParams.add( client.getSecond_name() );
            queryParams.add( String.valueOf(client.getId()) );

            DBService.executeUpdate(this.databaseName, query, queryParams);

        }
    }

