package de.jensklingenberg.test


class MockUser()

interface TestEnvironment {
    fun launchApp()
    fun assertTrue(assert: Boolean)
    fun assertEquals(expected: String, actual: String)
    fun clickOnNodeWithText(text:String)
    fun assertNodeDisplayed(text:String)

}


class MyTest(private val testEnvironment: TestEnvironment) {

    fun whenUserClicksOnListItem_OpenDetailPage() {
        testEnvironment.launchApp()
        testEnvironment.assertNodeDisplayed("Kumpir")
        testEnvironment.clickOnNodeWithText("Kumpir")
        testEnvironment.assertEquals("Hallo", "Bye")

    }


}
