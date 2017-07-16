import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test jsonWriter
 * example of creating json file named students.json inside of project directory.
 */
public class JsonWriterMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Gson gson = new Gson();
        for (int i = 0; i < 1000; i++) {
            students.add(new Student(makeName(i), makeNum(i)));
        }
        String json = gson.toJson(students);
        System.out.println(json);
        jsonFileWriter(json);
    }

    /*
    *   Korean name generator
    * */
    public static String makeName(int i) {
        String name = "";
        String[] lastNames = {"강", "김", "곽", "나", "노", "류", "민", "박", "방", "신", "심", "송", "안", "윤", "이", "임", "전", "장", "정", "최", "한", "황", "홍"};
        String[] firstNames = {
                "다현", "다형", "다환", "다훈", "대언", "대연", "대영", "대원", "대윤", "대은", "대율", "대인", "대한", "대현", "대형", "대환", "대훈", "대경", "대권", "대규", "대융", "대우", "대후", "도연", "도영", "도원", "도윤", "도율", "도헌", "도현", "도훈", "태연", "태영", "태원", "태윤", "태은", "태율", "태한", "태헌", "태현", "태환", "태훈", "태율", "상아", "상연", "상영", "상완", "상우", "상원", "상윤", "상헌", "상훈", "상현", "상호", "상환", "상후", "상희", "상율", "상일", "상엽", "상혁", "상수", "상준", "상민", "상빈", "서훈", "서환", "서후", "서준", "서진", "서빈", "선우", "선후", "성연", "성영", "성완", "성우", "성원", "성윤", "성헌", "성현", "성훈", "성호", "성후", "성희", "성율", "성하", "성한", "성은", "성일", "성혁", "성엽", "성수", "성재", "성진", "성준", "성찬", "성민", "성빈", "세연", "세영", "세은", "세완", "세원", "세윤", "세현", "세훈", "세호", "세후", "세율", "세희", "세한", "세일", "세혁", "세준", "세진", "세민", "세빈", "세명 ", "세준", "소율", "소훈", "송훈", "송후", "송혁", "성", "수민", "수빈", "승연", "승현", "승완", "승우", "승원", "승윤", "승헌", "승훈", "승한", "승호", "승환", "승후", "승일", "승엽", "승혁", "승진", "승준", "승민", "승빈", "시현", "시훈", "시윤", "시환", "시율", "시우", "시원", "시후", "시혁", "시헌", "시진", "시준", "시민", "시빈", "장연", "장완", "장원", "장우", "장윤", "장헌", "장훈", "장우", "장현", "장호", "장혁", "재연", "재영", "재우", "재원", "재헌", "재훈", "재현", "재호", "재환", "재율", "재일", "재혁", "재준", "재진", "재찬", "재성", "재민", "재빈", "정원", "정현", "정연", "정환", "정안", "정헌", "정후", "정혁", "정준", "정찬", "정수", "정민", "정빈", "제연", "재원", "제영", "제우", "제헌", "제현", "제훈", "제환", "제영", "제민", "제빈", "조현", "조영", "조원", "종연", "종완", "종우", "종원", "종윤", "종헌", "종훈", "종현", "종호", "종환", "종후", "종한", "종일", "종혁", "종수", "종성", "종찬", "종민", "종재", "종빈", "종명", "주원", "주호", "주환", "주한", "주헌", "주훈", "주혁", "주찬", "주성", "주빈", "준영", "준아", "준연", "준완", "준우", "준원", "준현", "준헌", "준호", "준후", "준일", "준혁", "준상", "준성", "지운", "지완", "지한", "지헌", "주훈", "지율", "지환", "지호", "지후", "지혁", "지민", "지빈", "지명", "진호", "진영", "진혁", "차헌", "차훈", "차민", "차빈", "찬영", "찬연", "찬우", "찬원", "찬헌", "찬현", "찬호", "찬후", "찬율", "찬혁", "채안", "채언", "채헌", "채훈", "채호", "채혁", "채민", "채빈", "청연", "청현", "청헌", "정훈", "청호", "청하", "청환", "청완", "초훈", "초한", "초헌"
        };
        name += lastNames[i % lastNames.length];
        name += firstNames[i % firstNames.length];
        return name;
    }

    public static String makeNum(int i) {
        String num = "888-8888-";
        if (i < 10) {
            num += "000" + i;
        } else if (i < 100) {
            num += "00" + i;
        } else {
            num += "0" + i;
        }
        return num;
    }

    /**
     * example of writing json file named students.json inside of project directory.
     */
    public static void jsonFileWriter(String json) {
        try {
            FileWriter file = new FileWriter(System.getProperty("user.dir") + "\\students.json");
            file.write(json);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
