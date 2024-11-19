
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The ContractRegistrationClosureRequest message is sent by the reporting party to the registration agent to close the registered contract subject to currency control.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationClosureRequestV04", propOrder = {
    "grpHdr",
    "regdCtrctClsr",
    "splmtryData"
})
public class ContractRegistrationClosureRequestV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader8 grpHdr;
    @XmlElement(name = "RegdCtrctClsr", required = true)
    protected List<RegisteredContract19> regdCtrctClsr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader8 }
     *     
     */
    public CurrencyControlHeader8 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader8 }
     *     
     */
    public ContractRegistrationClosureRequestV04 setGrpHdr(CurrencyControlHeader8 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the regdCtrctClsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdCtrctClsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdCtrctClsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisteredContract19 }
     * 
     * 
     */
    public List<RegisteredContract19> getRegdCtrctClsr() {
        if (regdCtrctClsr == null) {
            regdCtrctClsr = new ArrayList<RegisteredContract19>();
        }
        return this.regdCtrctClsr;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
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
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
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
     * Adds a new item to the regdCtrctClsr list.
     * @see #getRegdCtrctClsr()
     * 
     */
    public ContractRegistrationClosureRequestV04 addRegdCtrctClsr(RegisteredContract19 regdCtrctClsr) {
        getRegdCtrctClsr().add(regdCtrctClsr);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistrationClosureRequestV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
