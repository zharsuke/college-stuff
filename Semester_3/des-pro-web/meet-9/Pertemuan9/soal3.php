<?php
    include_once('koneksi.php');

    $sql = "
        INSERT INTO user (id, username, password) VALUES (NULL, 'user', '123')
    ";

    if (mysqli_query($conn, $sql)) {
        echo "data user berhasil dibuat";
    }else{
        echo "data user gagal dibuat <br>" . mysqli_error($conn);
    }

    mysqli_close($conn);
?>