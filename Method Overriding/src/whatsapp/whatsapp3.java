package whatsapp;

class whatsapp1 {
	void send_message(){
		System.out.println("sending message single tick");
	}
}

	class whatsapp2 extends whatsapp1{
		@Override
		void send_message(){
			super.send_message();
			System.out.println("sending message double tick");
		}
		void story(){
			System.out.println("story image supported");
		}
	}
		class whatsapp3 extends whatsapp2{
			@Override
			void send_message(){
				super.send_message();
				System.out.println("sending message blue tick");			
			}
			@Override
			void story(){
				super.story();
				System.out.println("story video supported");
			}
			void call(){
				System.out.println("call audio supported");
			}
		}
	


