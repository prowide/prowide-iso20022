
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
 * Class for auth.027.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccyCtrlStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.027.001.01")
public class MxAuth02700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CcyCtrlStsAdvc", required = true)
    protected CurrencyControlStatusAdviceV01 ccyCtrlStsAdvc;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 27;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CurrencyControlGroupStatus1 .class, CurrencyControlHeader2 .class, CurrencyControlPackageStatus1 .class, CurrencyControlRecordStatus1 .class, CurrencyControlStatusAdviceV01 .class, DateAndPlaceOfBirth.class, DocumentIdentification28 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GenericValidationRuleIdentification1 .class, LegalOrganisation2 .class, MxAuth02700101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalMessage3 .class, Party11Choice.class, Party28Choice.class, PartyIdentification77 .class, Period2 .class, Period4Choice.class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress19 .class, PostalAddress6 .class, StatisticalReportingStatus1Code.class, StatusReason6Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TradeParty2 .class, ValidationRuleSchemeName1Choice.class, ValidationStatusReason1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.027.001.01";

    public MxAuth02700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02700101(final String xml) {
        this();
        MxAuth02700101 tmp = parse(xml);
        ccyCtrlStsAdvc = tmp.getCcyCtrlStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ccyCtrlStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlStatusAdviceV01 }
     *     
     */
    public CurrencyControlStatusAdviceV01 getCcyCtrlStsAdvc() {
        return ccyCtrlStsAdvc;
    }

    /**
     * Sets the value of the ccyCtrlStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlStatusAdviceV01 }
     *     
     */
    public MxAuth02700101 setCcyCtrlStsAdvc(CurrencyControlStatusAdviceV01 value) {
        this.ccyCtrlStsAdvc = value;
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
    public static MxAuth02700101 parse(String xml) {
        return ((MxAuth02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02700101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02700101) parserImpl.read(MxAuth02700101 .class, xml, _classes));
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
     * Creates an MxAuth02700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02700101 message
     * @return
     *     a new instance of MxAuth02700101
     */
    public static final MxAuth02700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02700101 .class);
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
