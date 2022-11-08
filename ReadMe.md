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
    - TreeSet

자료구조 (맵, 가능한 코딩)

- Hashtable
- HashMap (필수. 무조건 예제 코딩)
- TreeMap

스트림을 활용한 데이터 정제 (무조건 코딩)

- map
- reduce
- filter