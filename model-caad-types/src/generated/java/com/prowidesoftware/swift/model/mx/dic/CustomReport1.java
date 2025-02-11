
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
 * The Custom Report message can be initiated by any party and received by any party (acquirer, agent, issuer or other party) connected to a network.
 * 
 * This message provides the capability to convey customized reports that are defined by bi-lateral agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomReport1", propOrder = {
    "envt",
    "cntxt",
    "rpt",
    "splmtryData"
})
public class CustomReport1 {

    @XmlElement(name = "Envt", required = true)
    protected Environment33 envt;
    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Rpt", required = true)
    protected ReportData6 rpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link Environment33 }
     *     
     */
    public Environment33 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment33 }
     *     
     */
    public CustomReport1 setEnvt(Environment33 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link Context17 }
     *     
     */
    public Context17 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context17 }
     *     
     */
    public CustomReport1 setCntxt(Context17 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportData6 }
     *     
     */
    public ReportData6 getRpt() {
        return rpt;
    }

    /**
     * Sets the value of the rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData6 }
     *     
     */
    public CustomReport1 setRpt(ReportData6 value) {
        this.rpt = value;
        return this;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CustomReport1 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
