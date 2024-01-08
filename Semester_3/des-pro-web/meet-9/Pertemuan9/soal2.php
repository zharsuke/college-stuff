<?php
    include_once('koneksi.php');

    $sql = "
    CREATE TABLE prakwebdb.user 
    ( 
      id INT NOT NULL AUTO_INCREMENT ,
      username VARCHAR(50) NOT NULL ,
      password VARCHAR(50) NOT NULL ,
      PRIMARY KEY  (id)
    ) 
    ";

    if (mysqli_query($conn, $sql)) {
        echo "Table user berhasil dibuat";
    }else{
        echo "Table user gagal dibuat <br>" . mysqli_error($conn);
    }

    mysqli_close($conn);
?>
