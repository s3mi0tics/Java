1. in index.jps file create an action column and add an edit button for each expense that links to an edit view by using the id in the params
2. create a new get route that uses that id to render an edit view using the ID in the params
3. Create a new view page that renders an edit form with validations for selected expense. 
4. have the form submit a put request to an edit route and if it passes validations edit the expense and redirect back to index otherwise return back to edit page
