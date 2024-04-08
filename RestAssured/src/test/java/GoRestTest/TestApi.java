package GoRestTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.Config;
public class TestApi {
    PostRequest post;
    GetRequest get;
    PutRequest put;
    DeleteRequest delete;
    @BeforeTest
    void setup(){
        post= new PostRequest();
        get= new GetRequest();
        put=new PutRequest();
        delete=new DeleteRequest();
    }
    @Test(priority = 0 , description = "Verify that Create user with valid credentials.")
    void Createuser1(){
        Assert.assertEquals(post.postRequest(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"female","active"),201);
    }
    @Test(priority = 1 , description = "Verify that Create user with inactive Status .")
    void Createuser2(){
        Assert.assertEquals(post.postRequest(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"female","inactive"),201);
    }
    @Test(priority = 2 , description = "Verify that User should not Create user with null email id .")
    void Createuser3(){
        Assert.assertEquals(post.invalidpostrequest(RandomGen.generateRandomName(),null,"female","inactive"),422);
    }
    @Test(priority = 3 , description = "Verify that User should not Create user with null name .")
    void Createuser4(){
        Assert.assertEquals(post.invalidpostrequest(null,RandomGen.generateDynamicEmail(),"female","inactive"),422);
    }
    @Test(priority = 4 , description = "Verify that User should not Create user with null name and email id .")
    void Createuser5(){
        Assert.assertEquals(post.invalidpostrequest(null,null,"female","inactive"),422);
    }
    @Test(priority = 5 , description = "Verify that User should not Create user with Same email id .")
    void Createuser6(){
        Assert.assertEquals(post.invalidpostrequest(RandomGen.generateRandomName(),"test@gmail.com","female","active"),422);
    }
    @Test(priority = 6 , description = "Verify that User should not Create user with null gender  .")
    void Createuser7(){
        Assert.assertEquals(post.invalidpostrequest(RandomGen.generateRandomName(),"test@gmail.com",null,"active"),422);
    }
    @Test(priority = 7 , description = "Verify that User should not Create user with invalid  gender  .")
    void Createuser8(){
        Assert.assertEquals(post.invalidpostrequest(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"third","active"),422);
    }
    @Test(priority = 8 , description = "Verify that User should not Create user with null status .")
    void Createuser9(){
        Assert.assertEquals(post.invalidpostrequest(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"female",null),422);
    }
    @Test(priority = 9 , description = "Verify that User should get all user list .")
    void Getuserlist1(){
        Assert.assertEquals(get.getAll(),200);
    }
    @Test(priority = 10 , description = "Verify that User should get user details with valid user id .")
    void Getuserlist2(){
        Assert.assertEquals(get.getId(Config.userId),200);
    }
    @Test(priority = 11 , description = "Verify that User should get user details with invalid user id .")
    void Getuserlist3(){
        Assert.assertEquals(get.getId("99991"),404);
    }
    @Test(priority = 12 , description = "Verify that User should get user details with Alfa numeric user id .")
    void Getuserlist4(){
        Assert.assertEquals(get.getId(" 1@1213"),404);
    }
    @Test(priority = 13 , description = "Verify that User should update details with valid information .")
    void Updateuser1(){
        Assert.assertEquals(put.updateUser(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"female","active"),200);
    }
    @Test(priority = 14 , description = "Verify that User should update details with inactive Status .")
    void Updateuser2(){
        Assert.assertEquals(put.updateUser(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),"female","inactive"),200);
    }
    @Test(priority = 15 , description = "Verify that User should not update details with invalid information.")
    void Updateuser4(){
        Assert.assertEquals(put.updateUser(RandomGen.generateRandomName(),"demo.com","female","active"),422);
    }
    @Test(priority = 16 , description = "Verify that User should not update details with null email id.")
    void Updateuser5(){
        Assert.assertEquals(put.invalidputrequest(RandomGen.generateRandomName(),null,"female","active"),404);
    }
    @Test(priority = 17 , description = "Verify that User should not update details with null name.")
    void Updateuser6(){
        Assert.assertEquals(put.invalidputrequest(null,"demo@gmail.com","female","active"),404);
    }
    @Test(priority = 18 , description = "Verify that User should not update details with invalid gender type.")
    void Updateuser7(){
        Assert.assertEquals(put.updateUser(null,"test@gmail.com","third","active"),422);
    }
    @Test(priority = 19 , description = "Verify that User should not update details with null gender field .")
    void Updateuser8(){
        Assert.assertEquals(put.invalidputrequest(RandomGen.generateRandomName(),RandomGen.generateDynamicEmail(),null,"active"),404);
    }
    @Test(priority = 20 , description = "Verify that User should delete record with valid id .")
    void Deleteuser1(){
        Assert.assertEquals(delete.DeleteUser(Config.userId),204);
    }
    @Test(priority = 21 , description = "Verify that User should not delete non existing record id .")
    void Deleteuser2(){
        Assert.assertEquals(delete.DeleteUser(Config.userId),404);
    }
    @Test(priority = 22 , description = "Verify that User should not delete record with invalid id .")
    void Deleteuser3(){
        Assert.assertEquals(delete.DeleteUser("1123@"),404);
    }

}
