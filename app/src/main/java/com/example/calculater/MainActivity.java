package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//자바 메소드, 변수, 변수타입, 조건문(if~else, switch, 연산자(Operations) 문법 사용
public class MainActivity extends AppCompatActivity {

    final String CLEAR_INPUT_TEXT = "0";


    boolean isFirstInput = true; // 입력 값이 처음 입력되는가를 체크
    int resultNunber = 0; // 계산된 결과 값을 저장하는 변수
    char operator = '+'; // 입력된 연산자를 저장하는 변수

    TextView resultText;  // 주황색글씨는 값이 정해져있지만 이건 안정해져있음, 레퍼런스변수, 주소값넣어줌. 메모리값을 참조해서 제어하게됨

//    final String CLEAR_INPUT_TEXT = "0"; //    resultText.setText(CLEAR_INPUT_TEXT);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.result_text); // 레이아웃 리설트 텍스트를 불러옴

    }
// AC, CE, BS, .이 클릭되었을때 실행되는 메소드
    public void ButtonClick(View view) {

//        Button getButton = findViewById(view.getId());

        //Log.e("buttonClick", "buttonClick 시작 :" + getButton.getText().toString() + "버튼이 클릭되었습니다.");
        //Log.d("buttonClick", "resultNumber = " + resultNunber);

        switch (view.getId()) {
            case R.id.all_clear_button:
                //isFirstInput = true;
                resultNunber = 0;
                operator = '+';
                setClearText(CLEAR_INPUT_TEXT); //중복되는 코드들 하나로 통합
               // resultText.setTextColor(0xFF666666);
                //resultText.setText(CLEAR_INPUT_TEXT);//(String.valueOf(resultNunber));
                break;

            case R.id.clear_entry_button:
                setClearText(CLEAR_INPUT_TEXT);
                break;
//                isFirstInput = true;
//                resultText.setTextColor(0xFF666666);
//                resultText.setText(CLEAR_INPUT_TEXT);

            case R.id.back_space_button:  //문자가 하나가 있는지없는지 문자개수를 체크
                if(resultText.getText().toString().length() > 1) {
                String getResultText = resultText.getText().toString();
                String subString = getResultText.substring(0,getResultText.length() -1);
                resultText.setText(subString);
                } else {
                    setClearText(CLEAR_INPUT_TEXT);
//                    resultText.setTextColor(0xFF666666);
//                    resultText.setText(CLEAR_INPUT_TEXT);
//                    isFirstInput = true;
                }
                break;
            case R.id.decimal_button:
                Log.e("buttonClick", "decimal_button 버튼이 클릭되었습니다."); // 정수형이라 패스

                break;


//            case R.id.Addition_button: /// 연산  / case가 중복될경우
//            case R.id.subtraction_button:
//            case R.id.division_button:
//            case R.id.multiply_button:
//                int lastNum = Integer.parseInt(resultText.getText().toString()); // Integer 정수형 전환 / int 정수형
//                resultNunber = intCal(resultNunber, lastNum, operator);
////                if (operator == '+') {
////                    resultNunber = resultNunber + lastNum;
////
////                } else if (operator == '-') {
////                    resultNunber = resultNunber - lastNum;
////
////                } else if (operator == '/') {
////                    resultNunber = resultNunber / lastNum;
////
////                } else if (operator == '*') {
////                    resultNunber = resultNunber * lastNum;
////                }
//                operator = getButton.getText().toString().charAt(0); //'+'; case 중복될경우 이렇게함. 버튼에 있는 텍스트를 가져와서 문자를 만드는데 0번째 문자를 캐릭터로 바꿔주어라.
//                resultText.setText(String.valueOf(resultNunber));
//                isFirstInput = true;
//               // Log.d("buttonClick", "add resultNumber = " + resultNunber);
//                break;
//            case R.id.result_button: //결과값 =
                 //int lastNum = Integer.parseInt(resultText.getText().toString());
//                if (operator == '+') {  //계산을 하기위해 가져옴
//                    resultNunber = resultNunber + Integer.parseInt(resultText.getText().toString()); // lastNum
//
//                } else if (operator == '-') {
//                    resultNunber = resultNunber - Integer.parseInt(resultText.getText().toString());// lastNum
//
//                } else if (operator == '/') {
//                    resultNunber = resultNunber / Integer.parseInt(resultText.getText().toString());// lastNum
//
//                } else if (operator == '*') {
//                    resultNunber = resultNunber * Integer.parseInt(resultText.getText().toString()); //lastNum;
//                }

//                resultNunber = intCal(resultNunber, Integer.parseInt(resultText.getText().toString()), operator);
//                resultText.setText(String.valueOf(resultNunber));
//                isFirstInput = true;
               // Log.d("buttonClick", "add resultNumber = " + resultNunber);
//                break;

//            case R.id.num_0_button:
//            case R.id.num_1_button:
//            case R.id.num_2_button:
//            case R.id.num_3_button:
//            case R.id.num_4_button:
//            case R.id.num_5_button:
//            case R.id.num_6_button:
//            case R.id.num_7_button:
//            case R.id.num_8_button:
//            case R.id.num_9_button:
//
//                if (isFirstInput) {
//                    resultText.setTextColor(0xFF000000);
//                    resultText.setText(getButton.getText().toString());
//                    isFirstInput = false; //첫입력이 아닐경우 1 추가
//                } else {
//                    resultText.append(getButton.getText().toString());
//                }
//                break;

//            default:
//
//                Log.e("buttonClick", "default :" + getButton.getText().toString() + "버튼이 클릭되었습니다.");
////                Toast.makeText(getApplicationContext(),getButton.getText().toString() + "버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
////토스트문은 앱에서 팝업창을 띄우고 문구를 보여주는 기능  앱을 설치한 사용자들도 볼수있음 디버깅할때 나만보고 어찌됬다 출력을 보려면 logcat
//                break;
        }

    }

// 입력된 숫자를 클리어 시켜주는 메소드
    public void  setClearText(String clearText){
        isFirstInput = true;
        resultText.setTextColor(0xFF666666);
        resultText.setText(clearText);
    }
    //0~9 버튼이 클릭되었을때 실행되는 메소드
    public void numButtonClick(View view) {
        Button getButton = findViewById(view.getId());
        if (isFirstInput) {
            resultText.setTextColor(0xFF000000);
            resultText.setText(getButton.getText().toString());
            isFirstInput = false;
        } else {
            if (resultText.getText().toString().equals("0")) {
                Toast.makeText(getApplicationContext(), "0으로 시작할수 없습니다.", Toast.LENGTH_SHORT).show();
                setClearText(CLEAR_INPUT_TEXT);
              // return;
            } else {
                resultText.append(getButton.getText().toString());
            }
        }

    }
    // 연산자가 클릭되었을때 실행되는 메소드
    public void operatorClick(View view) {
        Button getButton = findViewById(view.getId());

        if (view.getId() == R.id.result_button) {
            if(isFirstInput){
                resultNunber = 0;
                operator = '+';
                setClearText("0");
                //TODO: 다음에 실수형 계산기 만들때 윈도우 계산기 처럼 =을 두번 이상 누를때 실행 방법과 같이 구현할것!

            }else {

                resultNunber = intCal(resultNunber, Integer.parseInt(resultText.getText().toString()), operator);
                resultText.setText(String.valueOf(resultNunber));
                isFirstInput = true;

            }

        } else {
if(isFirstInput){
    operator = getButton.getText().toString().charAt(0);

}else {

    int lastNum = Integer.parseInt(resultText.getText().toString());
    resultNunber = intCal(resultNunber, lastNum, operator);
    operator = getButton.getText().toString().charAt(0);
    resultText.setText(String.valueOf(resultNunber));
    isFirstInput = true;
}
        }
    }

//사칙연산을 해서 값을 반환해 주는 메소드
    public int intCal(int result, int lastNum, char operator){
        if (operator == '+') {
            result += lastNum;

        } else if (operator == '-') {
            result -= lastNum;

        } else if (operator == '/') {
            result /= lastNum;

        } else if (operator == '*') {
            result *= lastNum;
        }
        return result;
    }

}

//        if (view.getId() == R.id.all_clear_button) {
//            isFirstInput = true;
//            resultNunber = 0;
//            operator = '+'
//            resultText.setTextColor(0xFF666666);
//            resultText.setText(String.valueOf(resultNunber));
//        }
//
//        if (view.getId() >= R.id.num_0_button
//                || view.getId() <= R.id.num_1_button
//                || view.getId() <= R.id.num_2_button
//                || view.getId() <= R.id.num_3_button
//                || view.getId() <= R.id.num_4_button
//                || view.getId() <= R.id.num_5_button
//                || view.getId() <= R.id.num_6_button
//                || view.getId() <= R.id.num_7_button
//                || view.getId() <= R.id.num_8_button
//                || view.getId() <= R.id.num_9_button) {
//            if (isFirstInput) {
//                resultText.setTextColor(0xFF000000);
//                resultText.setText(getButton.getText().toString());
//                isFirstInput = false; //첫입력이 아닐경우 1 추가
//            } else {
//                resultText.append(getButton.getText().toString());
//            }
//        }

