class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pos_speed = []

        for i in range(len(position)):
            pos_speed.append([position[i],speed[i]])

        pos_speed.sort(key = lambda x:x[0], reverse = True)

        time=[]
        print(pos_speed)
        for i in pos_speed:
            t = (target - i[0])/ i[1]
            if not time:
                time.append(t)

            else:
                if t>time[-1]:
                    time.append(t)

        return len(time)