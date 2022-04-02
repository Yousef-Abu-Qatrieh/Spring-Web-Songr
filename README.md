# Spring-Web-Songr
## Way That Application Work
The application have 4 Routes:    
index page it is the homepage for application   
hello  that will show the content of hello page    
capitalize/{name} which Transfer String text from lower case  to upper case   
albums which will return array of object of  the content of album class 
##AddAlbum
/albums first method will do GetMapping and show all the data inside the database album that we create    
/addAlbum second method will do PostMapping for the data that we fill it in addAlbum page then will add it in same page   
##SongAdd
/album first method will do GetMapping and show all the album inside the database song album that we create as Json file Array of Objects   
/album/{id}  second method will do GetMapping and show all the album specific album depends on his id   
/album/{id}  third method will do PostMapping, and it will add new album to song album database depends on the id we gave   
/songs fourth method will do GetMapping and show all the songs inside the song table that we create in song album database   
/addSong fifth method will do PostMapping for the data that we fill it in addSong page then will add it in same page    

