[자바 공부방]

자료구조 (콜랙션, 가능한 코딩)

- List
    - ArrayList (필수. 무조건 예제 코딩)
        - ArrayListExampleFirst ==> add()메소드 사용하기.
        - ArrayListExampleSecond ==> addAll()메소드 사용하기.
        - ArrayListExampleThird ==> remove()메소드 사용하기.
        - ArrayListExampleFourth ==> size()메소드 사용하기.
        - ArrayListExampleFifth ==> get()메소드 사용하기.
        - ArrayListExampleSixth ==> indexOf()메소드, lastIndexOf()메소드 사용하기.
        - ArrayListExampleSeventh ==> Iterator를 사용 해서, 출력 해보기.
        - ArrayListExampleEight ==> clear,isEmpty를 사용해서, 출력 해보기.
        - ArrayListExampleNinth ==> containsAll를 사용해서, 리스트 전체를 포함 하고 있는지 여부 체크.
        - ArrayListExampleTenth ==> retainAll() 사용하기. (공통 요소들만 남기고 나머지는 제거.)
        - ArrayListExampleEleventh ==> removeAll() 사용하기.
        - ArrayListExampleTwelfth ==> clone() 사용하기.
    - Vector 
        - ArrayList와 Vector의 차이점 : Vector는 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드들이 실행할 수 있습니다.
        - VectorExampleFirst ==> add().
        - VectorExampleSecond ==> remove().
        - VectorExampleSecond ==> get().
    - LinkedList
        - 각 노드가 데이터와 포인터를 가지고, 한 줄로 연결 되어 있는 방식의 자료 구조입니다.
        - ArrayList에 비해서, 데이터의 추가나 삭제가 용이하나, 인덱스가 없기에, 특정 요소에 접근하기 위해서는 순차 탐색이 필요로 하여, 탐색 속도가 떨어진다는 단점이 있다.
        - 결론 : 탐색 또는 정렬을 자주 하는 경우에는 배열을 사용 하고, 데이터듸 추가/삭제가 많은 경우 연결 리스트를 사용하는게 좋다.
        - addFirst(), addLast(), add(), offer().
        - removeFirst(), removeLast(), remove(), clear()
        - size(), Iterator를 통한, 순회.
        - contain(), indexOf()
        - poll(), pollFirst(), pop(), pollLast()
        - removeFirst(), removeLast()
        - removeFirstOccurrence(), removeLastOccurrence()
- Set
    - HashSet (필수. 무조건 예제 코딩)
        - 순서대로 입력 되지 않고, 일정하게 유지 되지 않는게 특징, null 요소도 허용 됨, 중복을 허용 하지 않음.
        - HashSet 해시코드를 이용해서, 내부 해시 테이블에 데이터를 저장함.
        - add(), remove(), clear(), size(), Iterator 출력.
        - contains()
    - TreeSet
        - 중복 없는 데이터 집합을 다룸, HashSet에 비해 상대적으로 데이터 처리 속도가 느리지만 다른 컬렉션에 비해 빠름, TreeMap Class와 유사한 작동 원리
        - TreeSet은 내부에 데이터 저장을 위한, RB-Tree(Red/Black Tree) 자료구조를 가지고 있다. RB 트리는 이진탐색 트리의 일종으로 저장된 값들이 
          트리 전체에 고루 저장되도록 하여, 비정상적으로 트리의 높이가 높아지는 현상이 없게 만든 균형 트리이다.
        - add(), remove(), clear(), size(), first(), last(), higher(), lower()
        -  Iterator 출력. , contains()

- Map
    - Hashtable
      - Key, Value 형태를 가진다.
      - HashMap은 동기화 되어 있으나, HashTable은 동기화 되어 있지 않다.
      - HashMap은 key,value에 null을 허용 하지만, HashTable에는 허용 하지 않는다.
      - put(), size(), get(), replace()
    - HashMap
      - put(), get(), remove()
      - 출력, entrySet(), KeySet()
    - TreeMap
      - put(), get(), remove()
      - 출력, entrySet(), KeySet()

- 스트림을 활용한 데이터 정제
  - boxed()
    - Int, Long, Double 배열로 Stream을 만들었을 경우
    - 각종 메소드를 사용하기 위해 사용
  - count() 
    - 배열, 컬렉션 크기 확인
  - sorted()
    - 정렬
  - sorted(Comparator.reverseOrder())
    - 역정렬
  - findFirst()
    - 스트림의 처음 값 가져오기
  - skip(배열크기 - 1).findFirst()
    - 스트림의 마지막 값 가져오기
  - skip(값)
    - 값의 인덱스까지 생략하고 나머지를 가져옴
  - limit(값)
    - 값의 인덱스까지 가져옴
  - distinct()
    - 중복 생략
  - max(데이터타입::compare)
    - 최대값
  - min(데이터타입::compare)
    - 최소값
  - average()
    - 평균
  - sum()
    - 합계
  - map((파라미터) -> 코드)
    - 각 인덱스의 값을 파라미터로 넘기고 코드를 수행한다
    - 주로 값을 바꿔주거나 더해주거나 할때 사용하게 된다
  - forEach((파라미터) -> {코드})
    - 각 인덱스의 값을 파라미터로 넘기고 코드를 수행
    - map과 forEach는 흡사하지만, map은 값만 바꿔주는 정도고, forEach는 if else나 메소드 등을 사용한느 것이 중점이 되겠다.
  - reduce(값, 데이터타입::sum)
    - 스트림의 값을 모두 하나로 합칠때 사용하는데, 데이터타입과 sum으로 하나로 합친 뒤, 마지막에 값을 더해서 가져오게 된다
  - filter(파라미터) -> {코드})
    - 코드에 맞는 값만 가져온다
  - collect()