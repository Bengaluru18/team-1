  // Initialize Firebase
  // Initialize Firebase
  var config = {
    apiKey: "AIzaSyBNTzvVNF9AVSdBp7FbpxcehI7r6fR5KDw",
    authDomain: "codeforgood-f9f92.firebaseapp.com",
    databaseURL: "https://codeforgood-f9f92.firebaseio.com",
    projectId: "codeforgood-f9f92",
    storageBucket: "codeforgood-f9f92.appspot.com",
    messagingSenderId: "882009424031"
  };
  firebase.initializeApp(config);

function login()
{

  var userEmail = document.getElementById("email").value;
  var userPass = document.getElementById("password").value;
    useremailid=userEmail;
    
  firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function(error) 
  {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    alert("Error");
  });

}

function readSurvey(){

//alert("in read survey");
//alert("!!");	
    var id=1;
    var sname=document.getElementById("sname").value;
//alert("!!!");
    var no=document.getElementById("no").value;
    var boys=document.getElementById("boys").value;
   var girls=document.getElementById("girls").value; 
var benches=document.getElementById("benches").value;
var washrooms=document.getElementById("washrooms").value;
if(document.getElementById("library").value=="on"){
var library=1;
}
else{
var library=0;
}
if(document.getElementById("scholars").value=="on"){
var scholars=1;
}
else{
var scholars=0;
}
if(document.getElementById("health").value=="on"){
var health=1;
}
else{
var health=0;
}
if(document.getElementById("meals").value=="on"){
var meals=1;
}
else{
var meals=0;
}  



     var ref = firebase.database().ref();
            //alert(ref);
                     
                firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: sname,
                    QuestionId: "1",
			SchoolId: "123"

            });

 
 firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: no,
                    QuestionId: "2",
			SchoolId: "123"

            });  
 firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: boys,
                    QuestionId: "3",
			SchoolId: "123"

            });  
 firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: girls,
                    QuestionId: "4",
			SchoolId: "123"

            }); 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: benches,
                    QuestionId: "5",
			SchoolId: "123"

            });                 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: washrooms,
                    QuestionId: "6",
			SchoolId: "123"

            });                 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: library,
                    QuestionId: "7",
			SchoolId: "123"

            });                 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: scholars,
                    QuestionId: "8",
			SchoolId: "123"

            });                 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: health,
                    QuestionId: "9",
			SchoolId: "123"

            });                 

firebase.database().ref('Survey/'+ ref.push().key).set({
                Ans: meals,
                    QuestionId: "10",
			SchoolId: "123"

            });                 

                              
    firebase.database().ref('School/'+ 123).set({
        Boys: 80,
        Cluster: 1,
        DateEnd: "12/01/18",
        Girls:50,
        NameOfIncharge:1,
        SchoolActive:1,
        SchoolName:3,
        StartDate:"07/07/18",
        status:0

            });   
        firebase.database().ref('School/'+ 456).set({
        Boys: 80,
        Cluster: 1,
        DateEnd: "12/01/18",
        Girls:50,
        NameOfIncharge:1,
        SchoolActive:1,
        SchoolName:2,
        StartDate:"07/07/18",
        status:0

            });  
        firebase.database().ref('School/'+ 789).set({
        Boys: 80,
        Cluster: 1,
        DateEnd: "12/01/18",
        Girls:50,
        NameOfIncharge:1,
        SchoolActive:1,
        SchoolName:1,
        StartDate:"07/07/18",
        status:0

            });  

    
    var rootRef = firebase.database().ref();
var urlRef = rootRef.child("School");
urlRef.once("value", function(snapshot) {
  snapshot.forEach(function(child) {
      console.log(child.DateEnd);
      alert(child.SchoolName);
    //if(child.key == 123) alert("yuppie");
  });
});
        
       alert("All Data Added Sucesfully");
    
    
       
              
   
                                                                                                  
}