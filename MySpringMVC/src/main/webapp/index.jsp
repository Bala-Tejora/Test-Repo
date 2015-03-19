<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
  <script src="http://cdn.oesmith.co.uk/morris-0.4.1.min.js"></script>
  <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
</head>
<body>

<div class="container" ng-app="" ng-controller="registerController">

  <div class="page-header">
  	<h2>To Do</h2>
  </div>	

  
  <form class="form-horizontal" role="form" name="myform" novalidate ng-submit="submitForm()">
  	<div class="form-group">
      <label class="control-label col-sm-2" for="name" >Name:</label>
      <div class="col-sm-4">
        <input required type="text" ng-model="name" id="name" name="name" class="form-control" placeholder="Enter name">
        <div ng-show="myform.$submitted || myform.name.$touched">
      		<div ng-show="myform.name.$error.required">Tell us your name.</div>
    	</div>
      </div>
    </div>  
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-4">
        <input type="text" ng-model="email" name="email" required class="form-control" placeholder="Enter email"/>
      </div>
    </div>
    
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <input required type="submit" name="submit" id="submit" class="btn btn-primary" ng-click="save()" value="Save" />
        <button type="submit" class="btn btn-primary" ng-click="getAll()">Get all ToDo</button>
      </div>
    </div>
  </form>
  

    <form name="userForm" ng-submit="submitForm()" novalidate class="form-horizontal" role="form">

        <!-- NAME -->
        <div class="form-group" ng-class="{ 'has-error' : userForm.name.$invalid && !userForm.name.$pristine }">
            <label  class="control-label col-sm-2" >Name: </label>
            <div class="col-sm-4">
           	 	<input type="text" name="name" class="form-control" ng-model="user.name" required>            	
            </div>
            <p class="help-block"  ng-show="userForm.name.$invalid && !userForm.name.$pristine">You name is required.</p>
        </div>
        
         <!-- EMAIL -->
        <div class="form-group" ng-class="{ 'has-error' : userForm.email.$invalid && !userForm.email.$pristine }">
            <label  class="control-label col-sm-2" >Email</label>
             <div class="col-sm-4">
           		 <input type="email" name="email" class="form-control" ng-model="user.email" required>
             </div>
            <p ng-show="userForm.email.$invalid && !userForm.email.$pristine" class="help-block">Enter a valid email.</p>
        </div>
        
        
        <div class="form-group"> 
        <div class="col-sm-offset-2 col-sm-10">
          <button type="submit" class="btn btn-primary"" ng-disabled="userForm.$invalid">Save</button>
        </div> 
        </div>
   </form>   
  

    <div class="panel panel-default">	  
		  <div class="panel-body">
		   	<p ng-bind="resultString"> </p>
		  </div>
<!-- 		  <div class="panel-body"> -->
<!-- 		   	<p ng-bind="todos"> </p> -->
<!-- 		  </div> -->
	</div>
  
  
    Search: <input type="text" name="searchKeyword" ng-model="searchKeyword"/>
  
    <table class="table table-striped">
    	<tr>
	        <th>Name</th>
	        <th>Email</th>
	        <th></th>
	        <th></th>
        </tr>
    	<tr ng-repeat="todo in result | filter: searchKeyword">
    		<td>{{ todo.name }}</td>
    		<td>{{ todo.email }}</td>
    		<td> <a href="#" class="button" ng-click="edit(todo);">Edit</a></td>
    		<td> <a href="#" class="button" ng-click="remove(todo.name);">Delete</a></td>
    	</tr>
    </table>
  
    <div id="charts" class="block"></div>
  
</div>


<script>



</script>

<script>


	function registerController($scope,$http)
	{
		
		
		
		$scope.submitForm = function() {

			// check to make sure the form is completely valid
			if ($scope.userForm.$valid) {
				alert('our form is amazing');
			}

		};
		
		$scope.data =  [
					    { y: '2006', a: 100, b: 90 , c:75 },
					    { y: '2007', a: 75,  b: 65 , c:75  },
					    { y: '2008', a: 50,  b: 40 , c:75 },
					    { y: '2009', a: 75,  b: 65 , c:75 },
					    { y: '2010', a: 50,  b: 40 , c:75 },
					    { y: '2011', a: 75,  b: 65 , c:75 },
					    { y: '2012', a: 100, b: 90 , c:75 }
					  ];
		
		Morris.Area({
			  element: 'charts',
			  data:$scope.data,
			  xkey: 'y',
			  ykeys: ['a', 'b' , 'c'],
			  labels: ['Data 1', 'Data 2', 'Data 3']
			});
		
		$scope.todos = "";
		$scope.name="";
		$scope.resultString = "";
		$scope.edit=false;
		$scope.message = function(){
			if($scope.name=="")
				return "";
			
			return "Welcome " + $scope.name;
		}
		
	 	$scope.getAll = function(){

	 		  $http.get("getToDo")
	 		    .success(function(response) {
	 		    	$scope.result = response;
	 		    	$scope.todos = response;
	 		    });
	 		
	 	}	
	 	
	 	
	 	$scope.save = function(){
	 		
	 		$http.get("addToDo?name="+$scope.name+"&email="+$scope.email)
	 			 .success(function(response){
	 				$scope.resultString = response;
	 				$scope.getAll();
	 				$scope.name="";
	 				$scope.email="";
	 			 });
	 	}
	 	
	 	$scope.remove = function(n){
	 		
	 			 		
	 		 $http.get("deleteToDo?name="+n)
			 .success(function(response){
				$scope.resultString = response;
				$scope.getAll();
			 }); 
	 		
	 	}
	 	
	 	
	 	$scope.edit = function(todo){
	 		
	 		
		 	$scope.name=todo.name;
		 	$scope.email=todo.email;
		 	
	 		
	 	}
	 	
	 	
	 	
		
	}

</script>

</body>
</html>
