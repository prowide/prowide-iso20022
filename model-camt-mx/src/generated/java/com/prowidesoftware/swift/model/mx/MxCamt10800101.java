
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.108.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "chqCxlOrStopReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.108.001.01")
public class MxCamt10800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ChqCxlOrStopReq", required = true)
    protected ChequeCancellationOrStopRequestV01 chqCxlOrStopReq;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 108;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, Cheque15 .class, ChequeCancellationOrStopRequestV01 .class, ChequeCancellationReason1 .class, ChequeCancellationReason1Choice.class, ChequePartyRole1Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader103 .class, MxCamt10800101 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.108.001.01";

    public MxCamt10800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt10800101(final String xml) {
        this();
        MxCamt10800101 tmp = parse(xml);
        chqCxlOrStopReq = tmp.getChqCxlOrStopReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt10800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the chqCxlOrStopReq property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeCancellationOrStopRequestV01 }
     *     
     */
    public ChequeCancellationOrStopRequestV01 getChqCxlOrStopReq() {
        return chqCxlOrStopReq;
    }

    /**
     * Sets the value of the chqCxlOrStopReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeCancellationOrStopRequestV01 }
     *     
     */
    public MxCamt10800101 setChqCxlOrStopReq(ChequeCancellationOrStopRequestV01 value) {
        this.chqCxlOrStopReq = value;
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
    public static MxCamt10800101 parse(String xml) {
        return ((MxCamt10800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt10800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt10800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt10800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt10800101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt10800101) parserImpl.read(MxCamt10800101 .class, xml, _classes));
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
     * Creates an MxCamt10800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt10800101 message
     * @return
     *     a new instance of MxCamt10800101
     */
    public final static MxCamt10800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt10800101 .class);
    }

}
