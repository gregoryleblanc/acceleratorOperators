package edu.ohio.inpp.acceleratorOperators;

import org.springframework.data.repository.CrudRepository;


// import java.net.URI;
// import com.sun.jersey.api.client.WebResource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// import com.example.accessingdatamysql.User;
import edu.ohio.inpp.acceleratorOperators.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

    // final WebResource service;
    // URI mariadbURI;
    String myDriver = "org.mariadb.jdbc.Driver";
    String myUrl = "jdbc:mariadb://localhost/tandem";
    String myUser = "edwards";
    String myPassword = "Edwards";

    // used to fetch a count of the "Active" operators in the database.
    public default long countActive() {
        long activeCount = 0;
        try {
            Class.forName(myDriver);
            Connection getActive = DriverManager.getConnection(myUrl, myUser, myPassword);
            String activeQuery = "SELECT COUNT(*) AS rowcount FROM operators WHERE status = 'Active';";
            Statement activeStatement = getActive.createStatement();
            ResultSet activeResult = activeStatement.executeQuery(activeQuery);
            activeResult.next();
            activeCount = activeResult.getLong("rowcount");
            activeStatement.close();
        } catch (Exception e){
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return activeCount;
    };

}
