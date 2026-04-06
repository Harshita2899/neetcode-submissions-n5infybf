class Solution:

    def encode(self, strs: List[str]) -> str:
        if not strs:
            return '##9'
        s = '#9'.join(strs)
        return s

    def decode(self, s: str) -> List[str]:
        if s == "##9":
            return []
        return s.split('#9')
