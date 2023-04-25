
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
 * The CCPMemberRequirementsReport message is sent from the central counterparty to the national competent authority. It is used to inform the national competent authority about the collateral requirements that a central counterparty obligates a clearing member post at the central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CCPMemberRequirementsReportV01", propOrder = {
    "intraDayRqrmntAmt",
    "intraDayMrgnCall",
    "endOfDayRqrmnt",
    "dfltFndRqrmnt",
    "splmtryData"
})
public class CCPMemberRequirementsReportV01 {

    @XmlElement(name = "IntraDayRqrmntAmt", required = true)
    protected List<IntraDayRequirement1> intraDayRqrmntAmt;
    @XmlElement(name = "IntraDayMrgnCall")
    protected List<IntraDayMarginCall1> intraDayMrgnCall;
    @XmlElement(name = "EndOfDayRqrmnt", required = true)
    protected List<EndOfDayRequirement2> endOfDayRqrmnt;
    @XmlElement(name = "DfltFndRqrmnt", required = true)
    protected List<DefaultFundRequirement1> dfltFndRqrmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the intraDayRqrmntAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intraDayRqrmntAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraDayRqrmntAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraDayRequirement1 }
     * 
     * 
     * @return
     *     The value of the intraDayRqrmntAmt property.
     */
    public List<IntraDayRequirement1> getIntraDayRqrmntAmt() {
        if (intraDayRqrmntAmt == null) {
            intraDayRqrmntAmt = new ArrayList<>();
        }
        return this.intraDayRqrmntAmt;
    }

    /**
     * Gets the value of the intraDayMrgnCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intraDayMrgnCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntraDayMrgnCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraDayMarginCall1 }
     * 
     * 
     * @return
     *     The value of the intraDayMrgnCall property.
     */
    public List<IntraDayMarginCall1> getIntraDayMrgnCall() {
        if (intraDayMrgnCall == null) {
            intraDayMrgnCall = new ArrayList<>();
        }
        return this.intraDayMrgnCall;
    }

    /**
     * Gets the value of the endOfDayRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the endOfDayRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndOfDayRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndOfDayRequirement2 }
     * 
     * 
     * @return
     *     The value of the endOfDayRqrmnt property.
     */
    public List<EndOfDayRequirement2> getEndOfDayRqrmnt() {
        if (endOfDayRqrmnt == null) {
            endOfDayRqrmnt = new ArrayList<>();
        }
        return this.endOfDayRqrmnt;
    }

    /**
     * Gets the value of the dfltFndRqrmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dfltFndRqrmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDfltFndRqrmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefaultFundRequirement1 }
     * 
     * 
     * @return
     *     The value of the dfltFndRqrmnt property.
     */
    public List<DefaultFundRequirement1> getDfltFndRqrmnt() {
        if (dfltFndRqrmnt == null) {
            dfltFndRqrmnt = new ArrayList<>();
        }
        return this.dfltFndRqrmnt;
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
     * Adds a new item to the intraDayRqrmntAmt list.
     * @see #getIntraDayRqrmntAmt()
     * 
     */
    public CCPMemberRequirementsReportV01 addIntraDayRqrmntAmt(IntraDayRequirement1 intraDayRqrmntAmt) {
        getIntraDayRqrmntAmt().add(intraDayRqrmntAmt);
        return this;
    }

    /**
     * Adds a new item to the intraDayMrgnCall list.
     * @see #getIntraDayMrgnCall()
     * 
     */
    public CCPMemberRequirementsReportV01 addIntraDayMrgnCall(IntraDayMarginCall1 intraDayMrgnCall) {
        getIntraDayMrgnCall().add(intraDayMrgnCall);
        return this;
    }

    /**
     * Adds a new item to the endOfDayRqrmnt list.
     * @see #getEndOfDayRqrmnt()
     * 
     */
    public CCPMemberRequirementsReportV01 addEndOfDayRqrmnt(EndOfDayRequirement2 endOfDayRqrmnt) {
        getEndOfDayRqrmnt().add(endOfDayRqrmnt);
        return this;
    }

    /**
     * Adds a new item to the dfltFndRqrmnt list.
     * @see #getDfltFndRqrmnt()
     * 
     */
    public CCPMemberRequirementsReportV01 addDfltFndRqrmnt(DefaultFundRequirement1 dfltFndRqrmnt) {
        getDfltFndRqrmnt().add(dfltFndRqrmnt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CCPMemberRequirementsReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
