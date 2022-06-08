package ru.mirea.galkina.mireaproject.pr6;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Story.class}, version = 2)
public abstract class AppDatebase extends RoomDatabase{
    public abstract StoryDao storyDao();
}