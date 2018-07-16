package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Notificacao {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Notificacao
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
				cronapi.pushnotification.Operations.sendNotification(
						Var.valueOf(
								"AAAAB4qkv78:APA91bFLCFibI14Rl3Lm92k-ZNj6vxECvUx31prnCU77tZa_A0nECAMwBL1KWv3kgytvuMLmx6AxBZx8mIRatmXw4fnw1IlGtSrrxZgf4al9s3CcAXLa2oW8umxBYihdduXmHjtYrth-"),
						Var.valueOf(
								"cOiIEDrB270:APA91bFqHrlTgcm8_-JlFXH_bPD0r86PBWI2DLxBNF5w8ONV_sDdm69eFrAD7RBkd16_zql8wj-McCVXbBkoOOxCLIvBYvHHym3I6xb0b0z84E2c1VF2u5nazpiUfR2lW9zaZ9fYo5yvd1Q7FBpEiZVePXOHJK-KRQ"),
						Var.valueOf("Testando"), Var.valueOf("Push de Notificação para teste"), Var.VAR_NULL);
				return Var.VAR_NULL;
			}
		}.call();
	}

}
