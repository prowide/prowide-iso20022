
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The CCPInteroperabilityReport message is sent from the central counterparty to the national competent authority. It is an optional report only to be sent if the central counterparty offers an interoperability arrangement with another CCP. It informs the national competent authority about the usage of the linked CCPs in terms of the exposures, margin calls and collateral from the interoperable CCP to the reporting CCP.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPInteroperabilityReportV01", propOrder = {
    "intrprbltyCCP",
    "splmtryData"
})
public class CCPInteroperabilityReportV01 {

    @XmlElement(name = "IntrprbltyCCP", required = true)
    protected List<InteroperabilityCCP1> intrprbltyCCP;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the intrprbltyCCP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrprbltyCCP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrprbltyCCP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteroperabilityCCP1 }
     * 
     * 
     * @return
     *     The value of the intrprbltyCCP property.
     */
    public List<InteroperabilityCCP1> getIntrprbltyCCP() {
        if (intrprbltyCCP == null) {
            intrprbltyCCP = new ArrayList<>();
        }
        return this.intrprbltyCCP;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the intrprbltyCCP list.
     * @see #getIntrprbltyCCP()
     * 
     */
    public CCPInteroperabilityReportV01 addIntrprbltyCCP(InteroperabilityCCP1 intrprbltyCCP) {
        getIntrprbltyCCP().add(intrprbltyCCP);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPInteroperabilityReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
