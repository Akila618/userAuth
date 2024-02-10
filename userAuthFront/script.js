let formSubmitted = false;

function saveUser() {
    // Check if the form has already been submitted
    if (formSubmitted) {
        window.alert("Form already submitted. Please refresh the page.");
        return;
    }

    let userName = $("#exampleFormControlInput1").val();
    let fullName = $("#exampleFormControlInput2").val();
    let email = $("#exampleFormControlInput3").val();
    let password = $("#exampleFormControlInput4").val();
    let confirmPassword = $("#exampleFormControlInput5").val();

    if (userName == "" || fullName == "" || email == "" || password == "" || confirmPassword == "") {
        window.alert("Please fill all the fields");
    } else if (password != confirmPassword) {
        window.alert("Password and Confirm Password do not match");
    } else {
        $.ajax({
            method: "POST",
            url: "http://localhost:8080/user/addUser",
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                "username": userName,
                "name": fullName,
                "email": email,
                "password": password
            }),
            success: function (data) {
                alert(data);
                // Set the flag to indicate that the form has been submitted
                formSubmitted = true;
            },
            error: function (error) {
                alert(error);
            }
        });
    }
}
