package varun.timetables_sql.data;

import android.content.ContentResolver;

import varun.timetables_sql.MainActivity;

/**
 * varun.timetables_sql.data (Timetables_sql)
 * Created by Varun garg <varun.10@live.com> on 12/14/2015 7:55 PM.
 */
public class TimetableContract {
    public static String CONTENT_AUTHORITY = MainActivity.PACKAGE_NAME;
    public static String PATH_TIMETABLE = "tt";
    public static String PATH_SECTION = "section";
    public static String PATH_FACULTY = "faculty";

    public static String TT_CELL_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + PATH_TIMETABLE;

}
