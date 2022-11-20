
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
 * The CurrencyControlSupportingDocumentDelivery message is sent by either the reporting party (respectively the registration agent) or the registration agent (respectively the reporting party) in response to the supporting document request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlSupportingDocumentDeliveryV02", propOrder = {
    "grpHdr",
    "spprtgDoc",
    "splmtryData"
})
public class CurrencyControlSupportingDocumentDeliveryV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader5 grpHdr;
    @XmlElement(name = "SpprtgDoc", required = true)
    protected List<SupportingDocument2> spprtgDoc;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader5 }
     *     
     */
    public CurrencyControlHeader5 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader5 }
     *     
     */
    public CurrencyControlSupportingDocumentDeliveryV02 setGrpHdr(CurrencyControlHeader5 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the spprtgDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spprtgDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtgDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportingDocument2 }
     * 
     * 
     */
    public List<SupportingDocument2> getSpprtgDoc() {
        if (spprtgDoc == null) {
            spprtgDoc = new ArrayList<SupportingDocument2>();
        }
        return this.spprtgDoc;
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
     * Adds a new item to the spprtgDoc list.
     * @see #getSpprtgDoc()
     * 
     */
    public CurrencyControlSupportingDocumentDeliveryV02 addSpprtgDoc(SupportingDocument2 spprtgDoc) {
        getSpprtgDoc().add(spprtgDoc);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public CurrencyControlSupportingDocumentDeliveryV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
