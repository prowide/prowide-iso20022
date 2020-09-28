
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for pacs.008.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pacs00800101"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01")
public class MxPacs00800101
    extends AbstractMX
{

    @XmlElement(name = "pacs.008.001.01", required = true)
    protected Pacs00800101 pacs00800101;
    public final static transient String BUSINESS_PROCESS = "pacs";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, CashClearingSystem3Code.class, ChargeBearerType1Code.class, ChargesInformation1 .class, ClearingChannel2Code.class, ClearingSystemIdentification1Choice.class, ClearingSystemMemberIdentification3Choice.class, CreditTransferTransactionInformation2 .class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader2 .class, Instruction3Code.class, Instruction4Code.class, InstructionForCreditorAgent1 .class, InstructionForNextAgent1 .class, LocalInstrument1Choice.class, MxPacs00800101 .class, NameAndAddress3 .class, NameAndAddress7 .class, OrganisationIdentification2 .class, Pacs00800101 .class, Party2Choice.class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentIdentification2 .class, PaymentTypeInformation3 .class, PersonIdentification3 .class, PostalAddress1 .class, Priority2Code.class, Purpose1Choice.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RegulatoryAuthority.class, RegulatoryReporting2 .class, RegulatoryReportingType1Code.class, RemittanceInformation1 .class, RemittanceLocation1 .class, RemittanceLocationMethod1Code.class, ServiceLevel1Code.class, ServiceLevel2Choice.class, SettlementDateTimeIndication1 .class, SettlementInformation1 .class, SettlementMethod1Code.class, SettlementTimeRequest1 .class, SimpleIdentificationInformation2 .class, StructuredRegulatoryReporting2 .class, StructuredRemittanceInformation6 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01";

    public MxPacs00800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPacs00800101(final String xml) {
        this();
        MxPacs00800101 tmp = parse(xml);
        pacs00800101 = tmp.getPacs00800101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPacs00800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pacs00800101 property.
     * 
     * @return
     *     possible object is
     *     {@link Pacs00800101 }
     *     
     */
    public Pacs00800101 getPacs00800101() {
        return pacs00800101;
    }

    /**
     * Sets the value of the pacs00800101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pacs00800101 }
     *     
     */
    public MxPacs00800101 setPacs00800101(Pacs00800101 value) {
        this.pacs00800101 = value;
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
    public static MxPacs00800101 parse(String xml) {
        return ((MxPacs00800101) MxReadImpl.parse(MxPacs00800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPacs00800101 parse(String xml, MxRead parserImpl) {
        return ((MxPacs00800101) parserImpl.read(MxPacs00800101 .class, xml, _classes));
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
     * Creates an MxPacs00800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPacs00800101 message
     * @return
     *     a new instance of MxPacs00800101
     */
    public final static MxPacs00800101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxPacs00800101 .class);
    }

}
