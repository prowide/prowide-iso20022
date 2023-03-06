
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Invoice related to a vehicle rental service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRentalInvoice1", propOrder = {
    "noShowInd",
    "adjstdInd",
    "rtrLctn",
    "chckOutDt",
    "chckOutTm",
    "chckInDt",
    "chckInTm",
    "drtn",
    "vhclClssInvcd",
    "vhclClssPrvdd",
    "trvlDstnc",
    "rntlChrg",
    "summryCmmdtyId",
    "insrncInd",
    "addtlAmt",
    "tax"
})
public class VehicleRentalInvoice1 {

    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "AdjstdInd")
    protected Boolean adjstdInd;
    @XmlElement(name = "RtrLctn")
    protected Address1 rtrLctn;
    @XmlElement(name = "ChckOutDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckOutDt;
    @XmlElement(name = "ChckOutTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckOutTm;
    @XmlElement(name = "ChckInDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chckInDt;
    @XmlElement(name = "ChckInTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar chckInTm;
    @XmlElement(name = "Drtn")
    protected String drtn;
    @XmlElement(name = "VhclClssInvcd")
    protected Vehicle4 vhclClssInvcd;
    @XmlElement(name = "VhclClssPrvdd")
    protected Vehicle4 vhclClssPrvdd;
    @XmlElement(name = "TrvlDstnc")
    protected Distance1 trvlDstnc;
    @XmlElement(name = "RntlChrg")
    protected List<RentalRate1> rntlChrg;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "AddtlAmt")
    protected List<Amount9> addtlAmt;
    @XmlElement(name = "Tax")
    protected List<Tax33> tax;

    /**
     * Gets the value of the noShowInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Sets the value of the noShowInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalInvoice1 setNoShowInd(Boolean value) {
        this.noShowInd = value;
        return this;
    }

    /**
     * Gets the value of the adjstdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdjstdInd() {
        return adjstdInd;
    }

    /**
     * Sets the value of the adjstdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalInvoice1 setAdjstdInd(Boolean value) {
        this.adjstdInd = value;
        return this;
    }

    /**
     * Gets the value of the rtrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link Address1 }
     *     
     */
    public Address1 getRtrLctn() {
        return rtrLctn;
    }

    /**
     * Sets the value of the rtrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address1 }
     *     
     */
    public VehicleRentalInvoice1 setRtrLctn(Address1 value) {
        this.rtrLctn = value;
        return this;
    }

    /**
     * Gets the value of the chckOutDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getChckOutDt() {
        return chckOutDt;
    }

    /**
     * Sets the value of the chckOutDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setChckOutDt(XMLGregorianCalendar value) {
        this.chckOutDt = value;
        return this;
    }

    /**
     * Gets the value of the chckOutTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getChckOutTm() {
        return chckOutTm;
    }

    /**
     * Sets the value of the chckOutTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setChckOutTm(XMLGregorianCalendar value) {
        this.chckOutTm = value;
        return this;
    }

    /**
     * Gets the value of the chckInDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getChckInDt() {
        return chckInDt;
    }

    /**
     * Sets the value of the chckInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setChckInDt(XMLGregorianCalendar value) {
        this.chckInDt = value;
        return this;
    }

    /**
     * Gets the value of the chckInTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getChckInTm() {
        return chckInTm;
    }

    /**
     * Sets the value of the chckInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setChckInTm(XMLGregorianCalendar value) {
        this.chckInTm = value;
        return this;
    }

    /**
     * Gets the value of the drtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtn() {
        return drtn;
    }

    /**
     * Sets the value of the drtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setDrtn(String value) {
        this.drtn = value;
        return this;
    }

    /**
     * Gets the value of the vhclClssInvcd property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssInvcd() {
        return vhclClssInvcd;
    }

    /**
     * Sets the value of the vhclClssInvcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public VehicleRentalInvoice1 setVhclClssInvcd(Vehicle4 value) {
        this.vhclClssInvcd = value;
        return this;
    }

    /**
     * Gets the value of the vhclClssPrvdd property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle4 }
     *     
     */
    public Vehicle4 getVhclClssPrvdd() {
        return vhclClssPrvdd;
    }

    /**
     * Sets the value of the vhclClssPrvdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle4 }
     *     
     */
    public VehicleRentalInvoice1 setVhclClssPrvdd(Vehicle4 value) {
        this.vhclClssPrvdd = value;
        return this;
    }

    /**
     * Gets the value of the trvlDstnc property.
     * 
     * @return
     *     possible object is
     *     {@link Distance1 }
     *     
     */
    public Distance1 getTrvlDstnc() {
        return trvlDstnc;
    }

    /**
     * Sets the value of the trvlDstnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance1 }
     *     
     */
    public VehicleRentalInvoice1 setTrvlDstnc(Distance1 value) {
        this.trvlDstnc = value;
        return this;
    }

    /**
     * Gets the value of the rntlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rntlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRntlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RentalRate1 }
     * 
     * 
     */
    public List<RentalRate1> getRntlChrg() {
        if (rntlChrg == null) {
            rntlChrg = new ArrayList<RentalRate1>();
        }
        return this.rntlChrg;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public VehicleRentalInvoice1 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public VehicleRentalInvoice1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
        return this;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount9 }
     * 
     * 
     */
    public List<Amount9> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<Amount9>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax33 }
     * 
     * 
     */
    public List<Tax33> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax33>();
        }
        return this.tax;
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
     * Adds a new item to the rntlChrg list.
     * @see #getRntlChrg()
     * 
     */
    public VehicleRentalInvoice1 addRntlChrg(RentalRate1 rntlChrg) {
        getRntlChrg().add(rntlChrg);
        return this;
    }

    /**
     * Adds a new item to the addtlAmt list.
     * @see #getAddtlAmt()
     * 
     */
    public VehicleRentalInvoice1 addAddtlAmt(Amount9 addtlAmt) {
        getAddtlAmt().add(addtlAmt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public VehicleRentalInvoice1 addTax(Tax33 tax) {
        getTax().add(tax);
        return this;
    }

}
