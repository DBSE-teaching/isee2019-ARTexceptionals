---
layout: post
title: "ISEE 2019 -- Basic Prototype"
date: 2019-04-15
---
<html>
<body style="background-color:powderblue;">
<h1>Project Basic Prototype</h1><br>
  
 <hr><br>
 
 <h1>Overview</h1><br>
 <p>Hello, welcome to the second blog of our project. In the previous blog, we introduced our team and which android app we’ll proceed with. In this blog, we will discuss about the customer requirements and user stories of our app.</p>
 <br><hr><br>

<h1>Requirements</h1><br>

<p>Requirement gathering is a first and essential step for developing an android app. We gathered requirements from client over series of meetings and also we have created a questionnaire for customer to fill it as per their requirement. The gathered requirements have been analyzed and categorized as Essential, Necessary and Desirable Requirements</p>
<h2>1. Essential Requirements:</h2><br>
	
<p>• Details/Parameters of expense/income? (Category, note, date, place, camera for receipt)<br>
			 <div class="tab">    a. Customisable category, deleting option<br>
			     b. Payment method of income and expenditure<br>
			     c. Free text note<br>
			     d. Date<br>
				 </div>
  • The application should work offline<br>
		• Application should store the data locally, one user is fine.<br>
		• Security feature(Pin for the app)<br>
		• Statistics<br></p> 	
<h2>2. Necessary Requirements:</h2><br>
 <p>	• Security question to retrieve forgotten password. Take the answer for security question while setting the pin<br>
		• The data needs to be filtered based on time, type of payment, catagory, range of money<br>
		• Currency change support<br></p> 
<h2>3. Desirable Requirements:</h2><br>
 <p>	• Sharing expense with other users<br>
		• Summarise monthly expenses in mail<br>
		• Store data on server/firebase<br>
		• Sync at particular time with firebase server<br></p> 

<h1>Wrong Assumptions</h1><br>
<p>By exploring various money control apps, we have presumed certain features need to be added in the app but after meeting client, we got clarification what to include and what to exclude. Some of our wrong assumptions are:<br>
		• Our assumption was to include multiple bank accounts in the app but the requirement is to monitor transactions of only one account.<br>
		• Barcode scanning is not required.<br>
		• We assumed that Login authentication should be given using google, fb or email whereas the client requirement is pin authentication.<br>
		• We got to know filtering the expenses based on Payment type, Range of money and category is required along with just date (initial assumption).</p>
<br><hr><br>

<h1>User Stories</h1><br>
<p> Our project is divided in to four Epics, each Epic consists of Stories and each stories will be further divided as Tasks. The same Tasks have been carried to our Scrum board. User stories diagram of our project is as shown below: </p>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/UserStories.png?raw=true" width="300" height="150">

<br><hr><br>

<h1>Use Case Diagram</h1><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/useCaseDiagram.png?raw=true" width="300" height="150">
<br><hr><br>

<h1>Estimated Time</h1><br>
<p>Time management is one of the challenges that we are facing. So, we have assigned estimated time for each task and estimated number of sprints for user stories. 
We have divided our User stories into four Epics (milestones or stages). Each Epic is categories in Stories and stories are further categorized as sub task. 
We have provided three sprints for each Epic, one and a half sprints for each story. For fast and smooth purpose of our work, we have divided our development teams into two groups, each working on one Epic. 
The time estimation of two other Epics will be re-calculated depending on first two Epics.</p>

<br><hr><br>
	
<h1>Class Diagram</h1><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/ClassDiagram.png?raw=true" width="300" height="150"><br>
<p>1. CashRecord is our core entity, it consists Balance, notes, Currency, Date, cashRecordType, paymentType and category. It has getter and setter methods for each attribute mentioned above.<br>
		•	Category is a custom class which contains categoryName and imageID. We provide set of predefined categories and if customer wants new category other than listed, then there will be an add option where he can add his own category. It has setter and getter methods.<br>
		•	All attributes defined in Constants will be static variables.<br>
		•	cashRecordType contains Income and Expense<br>
		•	PaymentType contains Cash, DebitCard, CreditCard and BankAccount<br>
		•	Currency type will give type of currency used for transaction.<br>
	2. MoneyControlManager will act as a controller for our MVC design pattern. It has all the functional requirements, it sets the views using CashRecordAdapter and it acceses the database and models using CashRecordDao.<br>
	3. CashRecord will save its objects in database using CashRecordDao.<br>
	4. CashRecordDao which has all the necessary data manipulation and data querying methods for database which are implemented using RoomDatabase.</p><br>
<hr><br>

<h1>Activity Diagrams</h1><br>
<p>Following are the two activity diagrams for two of the features of our app. </p><br>
<h2>Activity diagram of Navigation Bar:</h2><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/ActivityDiagram-2.jpeg?raw=true" width="300" height="150"><br>
<p>Here, the user will start with Pin Login, if the pin is correct then the user will be directed to Home Screen else it will be direct back to Pin Login. Once the user clicks on Home Screen, he will get Navigation bar menu which will navigate to History menu, clicking on History button will direct to Filter menu. 
In which the user can do three kinds of filtering for the transactions based on Time, Category and RangeOfMoney.Once he is done with these options he can stop</p><br>
<h2>Activity diagram of Settings:</h2><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/ActivityDiagram-1.jpeg?raw=true" width="300" height="150"><br>
<p>Here, the user will start by clicking on Settings, then Security Settings. User will be given Security Setings menu in which the user can Change Pin or he can enable or disable EnableLockScreen. After doing the changes he can stop.</p><br>
<br><hr><br>

<h1>Development Strategy</h1>
<p>In scrum board all the tasks will be picked from user stories for each sprint and all the boards/tasks will be assigned a priority and a requirement label. </p><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/ScrumBoardTasksLabels.png?raw=true" width="300" height="150"><br>
<p>We have created a developer_1 branch so that master will not get affected until & unless you pull the changes in to master. 
Again, each developer will create his own subbranch from developer_1 while working on the app and once he is finished, he will commit his changes to his working subbranch with proper comments. 
Then he will rise a pull request to developer_1. With this all the team members will be alerted, then the master will investigate the changes and check if it is affecting the existing code anyway. 
Then he will approve the pull request. In this way we can always assure the integrity of master and any release branches.</p><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/branching2.png?raw=true" width="300" height="150"><br>
<img src="https://github.com/DBSE-teaching/isee2019-ARTexceptionals/blob/master/docs/images/GitPullRequest.jpeg?raw=true" width="300" height="150"><br>



 
  <p>A product comes into its true colour only when each of the jigsaw pieces align properly. A team functions smoothly only when the team members work together. The gaps in the skills of one person needs to be covered by some other. Keeping this in mind, we will have regular standup meets to identify these gaps, discuss the challenges and help each other in growing as individual. Even though we have assigned roles for ourselves, we are not sandboxing ourselves to its parameters. This mindset is necessary for the flexibility of the team and thereby working seamlessly.</p>
  
  <br><hr>

<h3><i><strong>Thank You for visiting our blog!! That’s all for Now. Stay tuned for more updates on our project!!</strong></i></h3>


