
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.037.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "dbtAuthstnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.037.001.04")
public class MxCamt03700104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "DbtAuthstnReq", required = true)
    protected DebitAuthorisationRequestV04 dbtAuthstnReq;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 37;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CancellationReason14Choice.class, CancellationReason5Code.class, Case3 .class, CaseAssignment3 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndPlaceOfBirth.class, DebitAuthorisation1 .class, DebitAuthorisationRequestV04 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MxCamt03700104 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation3 .class, Party11Choice.class, Party12Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction2 .class, UnderlyingPaymentTransaction2 .class, UnderlyingStatementEntry1 .class, UnderlyingTransaction2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.037.001.04";

    public MxCamt03700104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt03700104(final String xml) {
        this();
        MxCamt03700104 tmp = parse(xml);
        dbtAuthstnReq = tmp.getDbtAuthstnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt03700104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the dbtAuthstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationRequestV04 }
     *     
     */
    public DebitAuthorisationRequestV04 getDbtAuthstnReq() {
        return dbtAuthstnReq;
    }

    /**
     * Sets the value of the dbtAuthstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationRequestV04 }
     *     
     */
    public MxCamt03700104 setDbtAuthstnReq(DebitAuthorisationRequestV04 value) {
        this.dbtAuthstnReq = value;
        return this;
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
    public static MxCamt03700104 parse(String xml) {
        return ((MxCamt03700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt03700104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt03700104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt03700104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt03700104 parse(String xml, MxRead parserImpl) {
        return ((MxCamt03700104) parserImpl.read(MxCamt03700104 .class, xml, _classes));
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
     * Creates an MxCamt03700104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt03700104 message
     * @return
     *     a new instance of MxCamt03700104
     */
    public static final MxCamt03700104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt03700104 .class);
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

}
