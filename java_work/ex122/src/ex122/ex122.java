package ex122;

public class ex122 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("===== 간단한 텍스트 어드벤처 게임에 오신 것을 환영합니다! =====");
        System.out.println("당신은 어느 숲 속에 들어왔습니다. 어떤 행동을 하시겠습니까?");
        
        while (true) {
            System.out.println("\n1. 앞으로 나아간다.");
            System.out.println("2. 오른쪽으로 돌아본다.");
            System.out.println("3. 뒤로 돌아간다.");
            System.out.println("4. 게임을 종료한다.");
            System.out.print("선택: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 비우기
            
            switch (choice) {
                case 1 -> System.out.println("앞으로 나아가던 중에 큰 돌에 발이 걸려 넘어집니다. 아프네요!");
                case 2 -> System.out.println("오른쪽으로 돌아보니 작은 호수가 보입니다. 시원한 바람이 불어오네요.");
                case 3 -> System.out.println("뒤로 돌아가던 중에 큰 나무에 등을 부딪힙니다. 조심하세요!");
                case 4 -> {
                    System.out.println("게임을 종료합니다. 이용해 주셔서 감사합니다!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }
}
		
	}
	
}
