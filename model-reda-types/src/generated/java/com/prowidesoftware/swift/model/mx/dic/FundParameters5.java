
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
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
 * Parameters required to request a fund reference data report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParameters5", propOrder = {
    "finInstrmDtls",
    "fndMgmtCpny",
    "dtFr",
    "ctryOfDmcl",
    "regdDstrbtnCtry"
})
public class FundParameters5 {

    @XmlElement(name = "FinInstrmDtls")
    protected List<FinancialInstrument71> finInstrmDtls;
    @XmlElement(name = "FndMgmtCpny")
    protected List<PartyIdentification139> fndMgmtCpny;
    @XmlElement(name = "DtFr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar dtFr;
    @XmlElement(name = "CtryOfDmcl")
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry")
    protected List<String> regdDstrbtnCtry;

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
     * {@link FinancialInstrument71 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<FinancialInstrument71> getFinInstrmDtls() {
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
     * {@link PartyIdentification139 }
     * 
     * 
     * @return
     *     The value of the fndMgmtCpny property.
     */
    public List<PartyIdentification139> getFndMgmtCpny() {
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
    public Calendar getDtFr() {
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
    public FundParameters5 setDtFr(Calendar value) {
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
    public FundParameters5 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the regdDstrbtnCtry property.
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<>();
        }
        return this.regdDstrbtnCtry;
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
    public FundParameters5 addFinInstrmDtls(FinancialInstrument71 finInstrmDtls) {
        getFinInstrmDtls().add(finInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the fndMgmtCpny list.
     * @see #getFndMgmtCpny()
     * 
     */
    public FundParameters5 addFndMgmtCpny(PartyIdentification139 fndMgmtCpny) {
        getFndMgmtCpny().add(fndMgmtCpny);
        return this;
    }

    /**
     * Adds a new item to the regdDstrbtnCtry list.
     * @see #getRegdDstrbtnCtry()
     * 
     */
    public FundParameters5 addRegdDstrbtnCtry(String regdDstrbtnCtry) {
        getRegdDstrbtnCtry().add(regdDstrbtnCtry);
        return this;
    }

}
