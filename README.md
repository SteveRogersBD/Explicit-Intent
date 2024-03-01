<H1>Learn about explicit intent and how to send information across activities</H1> <br>

<H2>From Activity</H2> <br>
Intent intent = new Intent(MainActivity.this, SecondActivity.class); <br>
                intent.putExtra("Sum", sum); //sending the data  <br>
                startActivity(intent);  <br>


<H2>To Activity</H2> <br>
ntent intent = getIntent(); <br>
        int sum = intent.getIntExtra("Sum",0); //default value 0 <br>

        Get the data sent from another activity
