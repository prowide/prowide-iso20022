
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.088.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "taxIncmStmtStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.088.001.01")
public class MxAuth08800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "TaxIncmStmtStsAdvc", required = true)
    protected TaxIncomeStatementStatusAdviceV01 taxIncmStmtStsAdvc;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 88;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime2Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, IncomeStatementAcceptedReason1 .class, IncomeStatementAcceptedStatus11Choice.class, IncomeStatementRejectionReason1 .class, IncomeStatementRejectionReason1Choice.class, IncomeStatementRejectionStatus11Choice.class, MxAuth08800101 .class, NameAndAddress5 .class, NoReasonCode.class, OriginalBusinessReport1 .class, PartyIdentification71Choice.class, PostalAddress1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxIncomeHeader1 .class, TaxIncomeReason1Code.class, TaxIncomeStatementStatusAdviceV01 .class, TaxIncomeStatus1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1auth.088.001.01";

    public MxAuth08800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth08800101(final String xml) {
        this();
        MxAuth08800101 tmp = parse(xml);
        taxIncmStmtStsAdvc = tmp.getTaxIncmStmtStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth08800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the taxIncmStmtStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeStatementStatusAdviceV01 }
     *     
     */
    public TaxIncomeStatementStatusAdviceV01 getTaxIncmStmtStsAdvc() {
        return taxIncmStmtStsAdvc;
    }

    /**
     * Sets the value of the taxIncmStmtStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeStatementStatusAdviceV01 }
     *     
     */
    public MxAuth08800101 setTaxIncmStmtStsAdvc(TaxIncomeStatementStatusAdviceV01 value) {
        this.taxIncmStmtStsAdvc = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAuth08800101 parse(String xml) {
        return ((MxAuth08800101) MxReadImpl.parse(MxAuth08800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth08800101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth08800101) parserImpl.read(MxAuth08800101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxAuth08800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth08800101 message
     * @return
     *     a new instance of MxAuth08800101
     */
    public final static MxAuth08800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth08800101 .class);
    }

}
