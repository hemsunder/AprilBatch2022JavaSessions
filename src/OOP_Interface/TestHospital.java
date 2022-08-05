package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();//FH -- cardioServices
		fh.dentalServices();//FH -- dentalServices
		fh.emergencyServices();//FH -- emergencyServices
		fh.entServices();//FH -- entServices
		fh.medicalInsurance();//FH -- medicalInsurance
		fh.medicalTraining();//FH -- medicalTraining
		fh.medicalResearch();//medical -- medicalResearch
		fh.medicalDevelopment();//UK -- medicalDevelopment & US -- medicalDevelopment
		fh.covid19Vaccination();//FH -- covid19Vaccination
		
		//Method hiding
		FortisHospital.billing();//FH -- billing
		USMedical.billing();//US Medical -- billing
		UKMedical.billing();//UK Medical -- billing
		
		System.out.println("==============");
		
		//System.out.println(fh.min_fee);
		System.out.println(FortisHospital.min_fee);//20
		System.out.println(USMedical.min_fee);//10
		
		//top casting: child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.cardioServices();//FH -- cardioServices
		us.emergencyServices();//FH -- emergencyServices
		us.neuroServices();//FH -- neuroServices
		us.physioServices();//FH -- physioServices
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();//FH -- emergencyServices
		uk.dentalServices();//FH -- dentalServices
		uk.entServices();//FH -- entServices
		
		//down casting:
		//FortisHospital fh1 = new USMedical();
	}

}
