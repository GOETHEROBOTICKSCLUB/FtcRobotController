package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import java.io.LineNumberReader;

@Autonomous(name = "test")
public class AutoPRIAMO extends LinearOpMode {
    //define
    DcMotor FL, FR, RL, RR, MM;

    Servo SerA;

    @Override
    public void runOpMode() {
        FL = hardwareMap.dcMotor.get("fl");
        FR = hardwareMap.dcMotor.get("fr");
        RL = hardwareMap.dcMotor.get("rl");
        RR = hardwareMap.dcMotor.get("rr");
        MM = hardwareMap.dcMotor.get("mm");
        SerA = hardwareMap.servo.get("servo");

        waitForStart();
        if (opModeIsActive()) {
            //run
            FL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            FR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RL.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            RR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            MM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

            SerA.setPosition(0.5);

        //    MM.setPower(-0.5);
        //    sleep(400);
        //    MM.setPower(0);

        /*    FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(-1);
            RR.setPower(1);
            sleep(600);  */





         /*   FL.setPower(-1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
            sleep(600);

            FL.setPower(0);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(0);
            sleep(600); */

            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(500);


        /*
            MM.setPower(0.40);
            sleep(1000);
            MM.setPower(0);
            sleep(1000);
            MM.setPower(-0.40);
            sleep(1000);
            MM.setPower(0);
            //прямо
            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(3000);
            //вправо без поворота
            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(-1);
            RR.setPower(-1);
            //право
            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
            //лево
            FL.setPower(-1);
            FR.setPower(-1);
            RL.setPower(-1);
            RR.setPower(-1);
            sleep(1000);
            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            //назад
            FL.setPower(-1);
            FR.setPower(1);
            RL.setPower(-1);
            RR.setPower(1);
            //стоп
            sleep(2000);
            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0);

        */
            /*FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(3000);
            FL.setPower(1);
            FR.setPower(1);
            RL.setPower(1);
            RR.setPower(1);
            sleep(1000);
            FL.setPower(1);
            FR.setPower(-1);
            RL.setPower(1);
            RR.setPower(-1);
            sleep(2000);
            FL.setPower(0);
            FR.setPower(0);
            RL.setPower(0);
            RR.setPower(0); */


            //on init
        }
    }
}

//extends -- продолжение класса)))))))))))))
