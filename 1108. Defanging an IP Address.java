python

class Solution:
    def defangIPaddr(self, address: str) -> str:
        return address.replace('.', '[.]')


java

class Solution {
    public String defangIPaddr(String address) {
       return address.replace(".","[.]");
    }
}