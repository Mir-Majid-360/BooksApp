package com.example.booksapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddBook extends AppCompatActivity {
    EditText bookName,bookAuthor,bookISBN,bookCourse;
    Button addBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        bookName = findViewById(R.id.et_bookName);
        bookAuthor = findViewById(R.id.et_bookAuthor);
        bookISBN = findViewById(R.id.et_bookISBN);
        bookCourse = findViewById(R.id.et_bookCourse);
        addBook = findViewById(R.id.btn_addBook);

        addBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()){
                    getBook();
                    Toast.makeText(AddBook.this, "Book Added Successfully", Toast.LENGTH_SHORT).show();

                   // clearForm();

                }
            }
        });


    }

    boolean validate() {
        boolean result = true;

        if (bookName.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter Book Name", Toast.LENGTH_SHORT).show();
            bookName.requestFocus();
            return false;
        }
        if (bookAuthor.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter Author Name", Toast.LENGTH_SHORT).show();
            bookAuthor.requestFocus();
            return false;
        }
        if (bookCourse.getText().toString().isEmpty()) {
            Toast.makeText(this, "Enter Course Name", Toast.LENGTH_SHORT).show();
            bookCourse.requestFocus();
            return false;
        }
        return true;
    }



    Book getBook(){
        Book book = new Book();
         book.setBookName(bookName.getText().toString());
         book.setBookAuthor(bookAuthor.getText().toString());
         book.setBooksBIN(bookISBN.getText().toString());
         book.setBookCourse(bookCourse.getText().toString());

         return book;



    }


}