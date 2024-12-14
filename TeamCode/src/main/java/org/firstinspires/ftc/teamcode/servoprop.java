package org.firstinspires.ftc.teamcode;

import static java.nio.file.Files.move;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "Denis")
public class servoprop  extends LinearOpMode {
    Servo Ser;
    ElapsedTime timer = new ElapsedTime();
    DcMotor serM;
    double a,b;

    @Override
    public void runOpMode() {

        serM = hardwareMap.dcMotor.get("mm");
        Ser = hardwareMap.servo.get("servo");
        Ser.setDirection(Servo.Direction.REVERSE);
        waitForStart();
        serM.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
       // timer.reset();
       /* while(timer.seconds()<5 && opModeIsActive())
        {
            serM.setPower(0);
            telemetry.addData("Encoder value:",serM.getCurrentPosition());
            telemetry.update();
        }*/
        serM.setPower(0);
        double f = 0.5;
        //double p = 0;
        while (opModeIsActive()) {

            if(gamepad2.left_stick_x > 0){
                float x = gamepad2.left_stick_x;
                serM.setPower(x);
            }
            serM.setPower(0);
            a = -gamepad1.left_stick_x;
            b = gamepad1.left_stick_y;
            if (gamepad2.x && f <= 1) {
                f = f + 0.01;
                sleep(5);
            }
            if (gamepad2.b && f > 0.5) {
                f = f - 0.01;
                sleep(5);
            }
            Ser.setPosition(f);

           /* if (gamepad2.y && p >= -0.01) {
                p = p + 0.01;
                sleep(5);
            }
            if (gamepad2.a && p <= 0.01) {
                p = p - 0.01;
                sleep(5);
            }
            serM.setPower(p);*/


        }
    }
}