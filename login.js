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

function login(){

  var userEmail = document.getElementById("email").value;
  var userPass = document.getElementById("password").value;
    useremailid=userEmail;
    
  firebase.auth().signInWithEmailAndPassword(userEmail, userPass).catch(function(error) 
  {
    // Handle Errors here.
    var errorCode = error.code;
    var errorMessage = error.message;
    window.alert(errorMessage);
  });

}

function readSurvey(){

//alert("in read survey");
//alert("!!");	
    var id=1;
    var sname=document.getElementById("sname").value;
//alert("!!!");
  //  var no=document.getElementById("no").value;
    //var boys=document.getElementById("boys").value;
    //var girls=document.getElementById("girls").value;      
      
   alert("!");
    // writing message onto firebase database first
    //var user = firebase.auth().currentUser;

     var ref = firebase.database().ref();
            //alert(ref);
                     
                firebase.database().ref('Questionaire/'+ ref.push().key).set({
                Ans: document.getElementById("sname").value,
                    Question: document.getElementById("sname").value,
            });                
              //alert(document.getElementById("sname").value);
              
   
                                                                                                  
}
