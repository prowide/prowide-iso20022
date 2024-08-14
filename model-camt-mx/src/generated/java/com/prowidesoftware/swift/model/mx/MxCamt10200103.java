
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.102.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cretStgOrdr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.102.001.03")
public class MxCamt10200103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CretStgOrdr", required = true)
    protected CreateStandingOrderV03 cretStgOrdr;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 102;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CreateStandingOrderV03 .class, DatePeriod2 .class, DatePeriod2Choice.class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, MessageHeader1 .class, MxCamt10200103 .class, PostalAddress27 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, StandingOrder10 .class, StandingOrderIdentification8 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.102.001.03";

    public MxCamt10200103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt10200103(final String xml) {
        this();
        MxCamt10200103 tmp = parse(xml);
        cretStgOrdr = tmp.getCretStgOrdr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt10200103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cretStgOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CreateStandingOrderV03 }
     *     
     */
    public CreateStandingOrderV03 getCretStgOrdr() {
        return cretStgOrdr;
    }

    /**
     * Sets the value of the cretStgOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateStandingOrderV03 }
     *     
     */
    public MxCamt10200103 setCretStgOrdr(CreateStandingOrderV03 value) {
        this.cretStgOrdr = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt10200103 parse(String xml) {
        return ((MxCamt10200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt10200103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt10200103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10200103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt10200103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt10200103) parserImpl.read(MxCamt10200103 .class, xml, _classes));
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
     * Creates an MxCamt10200103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt10200103 message
     * @return
     *     a new instance of MxCamt10200103
     */
    public final static MxCamt10200103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt10200103 .class);
    }

}
