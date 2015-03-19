<!DOCTYPE html>
<html>

<head>
<script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
</head>

<body>

<div ng-app="">
 
	<form>
		<input type="text" ng-model="name" id="name"/>
	</form>
	
	<p ng-bind="name"></p>

</div>

</body>
</html>
