class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        #create parent and rank array as per number of accounts
        n=len(accounts)
        par=[i for i in range(n)]
        rank=[1]*n
        def find(n):
            if par[n]!=n:
                par[n]=find(par[n])
            return par[n]

        def union(n1,n2):
            p1,p2=find(n1),find(n2)
            if p1==p2:
                return False
            
            if rank[p1]>rank[p2]:
                par[p2]=p1
                rank[p1]=rank[p1]+rank[p2]
            else:
                par[p1]=p2
                rank[p2]=rank[p1]+rank[p2]
            return True
        emailToAccountId={} #key:email value:index of account ..which eventuall making cluster of account linked with one email
        for i,email in enumerate(accounts):
            for e in email[1:]:
                if e in emailToAccountId:
                    union(i,emailToAccountId[e])
                else:
                    emailToAccountId[e]=i

        emailGroup=defaultdict(list) #key:account id, value:email ids
        for email,i in emailToAccountId.items():
            leader=find(i)
            emailGroup[leader].append(email)
        res=[] # as per sol 0th index is owner name and then continue with email id 
        for i, email_list in emailGroup.items():
            username=accounts[i][0]
            res.append([username]+email_list)
        
        return res

