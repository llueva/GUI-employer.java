echo "# GUI-employer" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/llueva/GUI-employer.git
git push -u origin mai.

//GUI ID Employ Project CSA

   private void buttonHandler(ActionEvent event) {
         String employID;
         int id;
        
        try {
            employID = textID.getText();
            id = Integer.parseInt(employID);
        }
        catch(NumberFormatException e) {
            statusArea.setText(e.getMessage() + ", number format error found.");
       // fix by 5/25th/22 
       }        
        employID = textID.getText();
        id = Integer.parseInt(employID);
        // (???) issue, might be penalized 
        
        try {
    id = Integer.parseInt(employID);
} catch (NumberFormatException) {
    //penalized
}