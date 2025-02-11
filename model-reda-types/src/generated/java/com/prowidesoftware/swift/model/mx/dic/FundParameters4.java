
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters required to request a Fund Processing Passport (FPP).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParameters4", propOrder = {
    "finInstrmDtls",
    "fndMgmtCpny",
    "dtFr",
    "ctryOfDmcl",
    "regdDstrbtnCtry"
})
public class FundParameters4 {

    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrument17> finInstrmDtls;
    @XmlElement(name = "FndMgmtCpny")
    protected List<PartyIdentification2Choice> fndMgmtCpny;
    @XmlElement(name = "DtFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtFr;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected String regdDstrbtnCtry;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument17 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<FinancialInstrument17> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<>();
        }
        return this.finInstrmDtls;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndMgmtCpny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndMgmtCpny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2Choice }
     * 
     * 
     * @return
     *     The value of the fndMgmtCpny property.
     */
    public List<PartyIdentification2Choice> getFndMgmtCpny() {
        if (fndMgmtCpny == null) {
            fndMgmtCpny = new ArrayList<>();
        }
        return this.fndMgmtCpny;
    }

    /**
     * Gets the value of the dtFr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtFr() {
        return dtFr;
    }

    /**
     * Sets the value of the dtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundParameters4 setDtFr(LocalDate value) {
        this.dtFr = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundParameters4 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdDstrbtnCtry() {
        return regdDstrbtnCtry;
    }

    /**
     * Sets the value of the regdDstrbtnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundParameters4 setRegdDstrbtnCtry(String value) {
        this.regdDstrbtnCtry = value;
        return this;
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
     * Adds a new item to the finInstrmDtls list.
     * @see #getFinInstrmDtls()
     * 
     */
    public FundParameters4 addFinInstrmDtls(FinancialInstrument17 finInstrmDtls) {
        getFinInstrmDtls().add(finInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the fndMgmtCpny list.
     * @see #getFndMgmtCpny()
     * 
     */
    public FundParameters4 addFndMgmtCpny(PartyIdentification2Choice fndMgmtCpny) {
        getFndMgmtCpny().add(fndMgmtCpny);
        return this;
    }

}
