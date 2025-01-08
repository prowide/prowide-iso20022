
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
 * Class for camt.048.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "modfyRsvatn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.048.001.07")
public class MxCamt04800107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ModfyRsvatn", required = true)
    protected ModifyReservationV07 modfyRsvatn;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 48;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CurrentOrDefaultReservation4Choice.class, DateAndDateTime2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, MarketInfrastructureIdentification1Choice.class, MessageHeader1 .class, ModifyReservationV07 .class, MxCamt04800107 .class, PostalAddress27 .class, Reservation4 .class, ReservationIdentification4 .class, ReservationType2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemIdentification2Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.048.001.07";

    public MxCamt04800107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt04800107(final String xml) {
        this();
        MxCamt04800107 tmp = parse(xml);
        modfyRsvatn = tmp.getModfyRsvatn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt04800107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the modfyRsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ModifyReservationV07 }
     *     
     */
    public ModifyReservationV07 getModfyRsvatn() {
        return modfyRsvatn;
    }

    /**
     * Sets the value of the modfyRsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyReservationV07 }
     *     
     */
    public MxCamt04800107 setModfyRsvatn(ModifyReservationV07 value) {
        this.modfyRsvatn = value;
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
    public static MxCamt04800107 parse(String xml) {
        return ((MxCamt04800107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04800107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt04800107 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt04800107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt04800107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt04800107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt04800107) parserImpl.read(MxCamt04800107 .class, xml, _classes));
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
     * Creates an MxCamt04800107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt04800107 message
     * @return
     *     a new instance of MxCamt04800107
     */
    public static final MxCamt04800107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt04800107 .class);
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
