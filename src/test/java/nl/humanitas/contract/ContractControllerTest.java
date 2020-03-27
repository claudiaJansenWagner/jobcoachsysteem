package nl.humanitas.contract;

import nl.humanitas.controller.ContractController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
class ContractControllerTest {

    private static final String CONTRACT_ENDPOINT = "/contracten";

    private MockMvc mockMvc;

    @InjectMocks
    private ContractController contractController;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(contractController).build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenGetExisitingContractThenItShouldReturnContract() {
    }

    @Test
    void whenGetNonExisitingContractThenItShouldReturnMessage() {
    }

    @Test
    void WhenGetContractOverzichtThenItShouldReturnAllContracten() {
    }


    @Test
    void WhenGetContractOverzichtWithOutContractenThenItShouldReturnMessage() {
    }

    @Test
    void WhenAddContractThenItShouldAddContract() {
    }

    @Test
    void WhenUpdateExisitingContractThenItShouldChangeExistingContract() {
    }

    @Test
    void WhenUpdateNonExisitingContractThenItShouldReturnMessage() {
    }

    @Test
    void WhenDeleteExistingContractThenContractShouldNoLongExist() {
    }

    @Test
    void WhenDeleteNonExistingContractThenItShouldReturnMessage() {
    }
}