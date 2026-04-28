
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
 * The ChequePresentmentNotification message is sent by a drawer bank, or a bank acting on behalf of the drawer bank to the bank on which a/several cheque(s) has been drawn (the drawee bank).
 * It is used to advise the drawee bank, or confirm to an enquiring bank, the details concerning the cheque(s) referred to in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequePresentmentNotificationV02", propOrder = {
    "grpHdr",
    "chq",
    "splmtryData"
})
public class ChequePresentmentNotificationV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader103 grpHdr;
    @XmlElement(name = "Chq", required = true)
    protected List<Cheque17> chq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader103 }
     *     
     */
    public GroupHeader103 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader103 }
     *     
     */
    public ChequePresentmentNotificationV02 setGrpHdr(GroupHeader103 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the chq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cheque17 }
     * 
     * 
     */
    public List<Cheque17> getChq() {
        if (chq == null) {
            chq = new ArrayList<Cheque17>();
        }
        return this.chq;
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
     * Adds a new item to the chq list.
     * @see #getChq()
     * 
     */
    public ChequePresentmentNotificationV02 addChq(Cheque17 chq) {
        getChq().add(chq);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ChequePresentmentNotificationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
