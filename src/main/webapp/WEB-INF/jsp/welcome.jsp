<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Coviam</title>
</head>
<body>
<!--
<h1 style="text-align:centre;">
 Coviam Employees Profile</h1>

<form action="findbyFullname" method="get">

Find By User Name:
  <div style="overflow: hidden; padding-right: .5em;">
  <input type="text" name="fullname" style="width: 40%;"/>
  </div>​
  <input type="submit"value="FindByName" style="float:left"/>
  </form>

  <form action="findbyService" method="get">
  Find By Team(Input MicroService Name):
    <div style="overflow: hidden; padding-right: .5em;">
    <input type="text" name="service" style="width: 40%;"/>
    </div>​
    <input type="submit"value="FindByMicroservice" style="float: left"/>
    </form>

      Find All Employees Information:
            <form action="findAll" method="get">
        <div style="overflow: hidden; padding-right: .5em;">
        </div>​
        <button onclick="myFunction()">Find All</button>
        <script>
        function myFunction() {
            setTimeout(function(){
                  <form action="findAll" method="get">
            <input type="submit"/> }, 10000);
        }
        </script>

        </form>

-->
    <style type="text/css">
        .user-container{ width: 50%;}
        .username-container{ margin: 10px;}
        .service-name-container{margin: 10px;}
        .fullNameLable{ margin-right: 46px;}
        button{    padding: 8px;
                            margin-left: -5px;
                            background-color: #8aaeff;
                            color: white;
                            border: none;
                            cursor: pointer;
                                }

                            input{
                                    line-height: 21px;
                                    padding: 2px;
                                    width: 50%;
                            }
                            .findAll{
                                display: none;
                            }
                            .findAllLabel{margin-right: 83px;}
                            .findAllBtn{margin-left: 1px;}
    </style>
    <div class="user-container">
        <div class="username-container">
            <form action="findbyFullname" method="get">
                <label class="fullNameLable" for="FindByName">FindByName</label>
                <input type="text" name="fullname" id="FindByName" />
                <button type="submit" class="fullnameSubmit">FindByName</button>
            </form>
        </div>
        <div class="service-name-container">
            <form action="findbyService" method="get">
                <label for="FindByMicroservice">FindByMicroservice</label>
                <input type="text" name="service" id="FindByMicroservice" />
                <button type="submit">FindByMicroservice</button>
            </form>
        </div>

         <div class="service-name-container">
            <form action="findAll" method="get">
                <label for="FindByMicroservice" class="findAllLabel">FindAll</label>
                <button type="submit" class="findAllBtn">FindAll</button>
            </form>
        </div>
    </div>

</body>
</html>